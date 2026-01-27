-- VALORANT DATABASE

-- Insertar Modos de Juego
INSERT INTO modo_juego (nom, descripcio) VALUES ('Competitiu', 'Mode de joc ranquit amb sistema ELO');
INSERT INTO modo_juego (nom, descripcio) VALUES ('No Classificat', 'Partides normals sense afectar el rang');
INSERT INTO modo_juego (nom, descripcio) VALUES ('Deathmatch', 'Mode de practica de punteria lliure');
INSERT INTO modo_juego (nom, descripcio) VALUES ('Spike Rush', 'Partides rapides amb armes aleatories');
INSERT INTO modo_juego (nom, descripcio) VALUES ('Escalada', 'Progressio d armes amb cada mort');

-- Insertar Mapes (amb relació a Modo de Juego)
-- Competitiu (id=1)
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Ascent', 'Mapa italia amb dos sites i zona central oberta', '/img/ascent.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Bind', 'Mapa marroqui amb teleportadors', '/img/bind.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Haven', 'Mapa amb tres sites de bomba', '/img/haven.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Split', 'Mapa japones amb ascensors', '/img/split.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Icebox', 'Mapa artic amb ziplines', '/img/icebox.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Breeze', 'Mapa tropical amb espais amplis', '/img/breeze.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Fracture', 'Mapa amb estructura en H', '/img/fracture.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Pearl', 'Mapa submarí portugues', '/img/pearl.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Lotus', 'Mapa indi amb tres sites i portes giratorias', '/img/lotus.jpg', 1);
INSERT INTO mapa (nom, descripcio, imatge, modo_juego_id) VALUES ('Sunset', 'Mapa a Los Angeles', '/img/sunset.jpg', 1);

-- Insertar Personatges (Agents)
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Jett', 'Duelista', 'Agent coreana amb habilitats de vent i mobilitat', '/img/jett.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Phoenix', 'Duelista', 'Agent britanic amb habilitats de foc', '/img/phoenix.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Reyna', 'Duelista', 'Agent mexicana que es cura amb les morts', '/img/reyna.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Raze', 'Duelista', 'Agent brasilera especialista en explosius', '/img/raze.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Yoru', 'Duelista', 'Agent japones amb habilitats de teleportacio', '/img/yoru.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Sage', 'Sentinella', 'Agent xinesa amb habilitats curatives', '/img/sage.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Cypher', 'Sentinella', 'Agent marroqui especialista en vigilancia', '/img/cypher.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Killjoy', 'Sentinella', 'Agent alemanya amb torretes i nanobots', '/img/killjoy.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Chamber', 'Sentinella', 'Agent frances amb armes personalitzades', '/img/chamber.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Sova', 'Iniciador', 'Agent rus amb arc i dron de reconeixement', '/img/sova.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Breach', 'Iniciador', 'Agent suec amb habilitats sismiques', '/img/breach.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Skye', 'Iniciador', 'Agent australiana amb criatures curatives', '/img/skye.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('KAY/O', 'Iniciador', 'Robot amb habilitats supressores', '/img/kayo.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Fade', 'Iniciador', 'Agent turca amb habilitats de terror', '/img/fade.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Omen', 'Controlador', 'Agent misteriós amb teleportacio i fums', '/img/omen.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Brimstone', 'Controlador', 'Agent america amb suport orbital', '/img/brimstone.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Viper', 'Controlador', 'Agent americana amb toxines', '/img/viper.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Astra', 'Controlador', 'Agent ghanesa amb poders cosmics', '/img/astra.jpg');
INSERT INTO personatge (nom, rol, descripcio, imatge) VALUES ('Harbor', 'Controlador', 'Agent indi amb control d aigua', '/img/harbor.jpg');

-- Insertar Habilitats (amb relació a Personatge)
-- Jett (id=1)
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Cloudburst', 'Llança una bola de fum que es pot dirigir', 'C', NULL, 1);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Updraft', 'Impulsa cap amunt', 'Q', NULL, 1);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Tailwind', 'Dash rapid en la direccio del moviment', 'E', NULL, 1);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Blade Storm', 'Llança ganivets letals amb precisio', 'X', NULL, 1);

-- Sage (id=6)
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Barrier Orb', 'Crea una paret solida de gel', 'C', NULL, 6);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Slow Orb', 'Crea un camp que alenteix els enemics', 'Q', NULL, 6);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Healing Orb', 'Cura a un aliat o a si mateixa', 'E', NULL, 6);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Resurrection', 'Reviu a un aliat caigut', 'X', NULL, 6);

-- Omen (id=15)
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Shrouded Step', 'Teleportacio curta', 'C', NULL, 15);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Paranoia', 'Projectil que cega els enemics', 'Q', NULL, 15);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Dark Cover', 'Llança esferes de fum', 'E', NULL, 15);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('From the Shadows', 'Teleportacio a qualsevol punt del mapa', 'X', NULL, 15);

-- Sova (id=10)
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Owl Drone', 'Dron de reconeixement', 'C', NULL, 10);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Shock Bolt', 'Fletxa que fa dany electric', 'Q', NULL, 10);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Recon Bolt', 'Fletxa que revela enemics', 'E', NULL, 10);
INSERT INTO habilitat (nom, descripcio, tecla, imatge, personatge_id) VALUES ('Hunter s Fury', 'Tres raigs d energia que travessen parets', 'X', NULL, 10);

-- Insertar Armes
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Classic', 'Pistola', 0, 'Pistola inicial gratuita', '/img/classic.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Shorty', 'Pistola', 150, 'Escopeta de butxaca amb dos trets', '/img/shorty.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Frenzy', 'Pistola', 450, 'Pistola automatica lleugera', '/img/frenzy.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Ghost', 'Pistola', 500, 'Pistola silenciada amb bon rang', '/img/ghost.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Sheriff', 'Pistola', 800, 'Revolver potent amb alt dany', '/img/sheriff.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Stinger', 'SMG', 950, 'SMG lleugera amb alta cadencia', '/img/stinger.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Spectre', 'SMG', 1600, 'SMG silenciada i versatil', '/img/spectre.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Bucky', 'Escopeta', 850, 'Escopeta amb mode alternatiu', '/img/bucky.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Judge', 'Escopeta', 1850, 'Escopeta automatica', '/img/judge.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Bulldog', 'Rifle', 2050, 'Rifle amb rafega de tres trets', '/img/bulldog.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Guardian', 'Rifle', 2250, 'Rifle semi-automatic d alta precisio', '/img/guardian.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Phantom', 'Rifle', 2900, 'Rifle automatic silenciat', '/img/phantom.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Vandal', 'Rifle', 2900, 'Rifle automatic amb alt dany a totes les distancies', '/img/vandal.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Marshal', 'Sniper', 950, 'Franctirador economic amb cadencia alta', '/img/marshal.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Operator', 'Sniper', 4700, 'Franctirador potent que mata d un tret', '/img/operator.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Ares', 'Metralladora', 1600, 'Metralladora lleugera amb gran carregador', '/img/ares.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Odin', 'Metralladora', 3200, 'Metralladora pesada amb molta municio', '/img/odin.jpg');
INSERT INTO arma (nom, categoria, preu, descripcio, imatge) VALUES ('Knife', 'Cos a cos', 0, 'Arma blanca per defecte', '/img/knife.jpg');

