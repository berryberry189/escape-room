-- 빙탈출 카페 데이터
INSERT INTO STORE(STORE_ID, NAME) VALUES(1, '넥스트에디션');
INSERT INTO STORE(STORE_ID, NAME) VALUES(2, '비밀의정원');
INSERT INTO STORE(STORE_ID, NAME) VALUES(3, '머더파커');

-- 방탈출 카페 지점 데이터
-- 넥스트 에디션 지점
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (1, 1, '강남점', 'https://www.nextedition.co.kr/shops/NextEdition%20Gangnam', '서울특별시 서초구 강남대로79길 59 B3F', '025125677', '강남', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (2, 1, '강남2호점', 'https://www.nextedition.co.kr/shops/NextEdition%20Gangnam2', '서울특별시 강남구 역삼1동 817-18 3, 4F', '025545584', '강남', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (3, 1, '강남3호점', 'https://www.nextedition.co.kr/shops/NextEdition%20Gangnam3', '서울특별시 서초구 강남대로65길 7 피렌체빌딩 5층', '025333108', '강남', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (4, 1, '강남신논현점', 'https://www.nextedition.co.kr/shops/NextEdition%20gangnamsinnonhyun', '서울특별시 서초구 사평대로56길 14 지하 1층', '025957914', '강남', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (5, 1, '강남5호점', 'https://www.nextedition.co.kr/shops/NextEdition%20gangnam5', '서울특별시 강남구 강남대로94길 11 지하1층', '025589818', '강남', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (6, 1, '신촌점', 'https://www.nextedition.co.kr/shops/NextEdition%20Sinchon', '서울특별시 서대문구 창천동 2-7 B1', '05074650048', '신촌', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (7, 1, '건대점', 'https://www.nextedition.co.kr/shops/NextEdition%20Gundae', '서울특별시 광진구 자양동 17-5 B1', '024639967', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (8, 1, '건대2호점', 'https://www.nextedition.co.kr/shops/NextEdition%20Gundae2', '서울특별시 광진구 아차산로192 별관 2,3층', '024621460', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (9, 1, '건대 보네르관', 'https://www.nextedition.co.kr/shops/NextEdition%20Gundae%Bonheur', '서울특별시 광진구 화양동 9-19 , 지하1층', '01066687451', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (10, 1, '부천점', 'https://www.nextedition.co.kr/shops/NextEdition%20Bucheon', '경기도 부천시 원미구 심곡동 175-9 6층', '0326677772', '경기', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (11, 1, '부평점', 'https://www.nextedition.co.kr/shops/NextEdition%20Bupyung', '인천광역시 부평구 부평문화로80번길 16 5층', '07088655424', '인천', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (12, 1, '분당서현점', 'https://www.nextedition.co.kr/shops/NextEdition%20Bundangseohyun', '인천광역시 부평구 부평문화로80번길 16 5층', '0317819020', '경기', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (13, 1, '신림점', 'https://www.nextedition.co.kr/shops/NextEdition%20Sinlim', '서울특별시 관악구 남부순환로 1598, 지하1층', '028823775', '신림', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (14, 1, '잠실점', 'https://www.nextedition.co.kr/shops/NextEdition%20Jamsil', '서울특별시 송파구 올림픽로 118, 지하1층', '024238255', '잠실', '2021-12-07 16:37:25');

-- 비밀의 화원 지점
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (15, 2, '다운타운 홍대', 'http://secretgardenescape.com/reservation.html?k_shopno=2', '서울 마포구 양화로 156 (동교동, LG팰리스빌딩) 지하 2층', '0231443288', '홍대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (16, 2, '리버타운 강남', 'http://secretgardenescape.com/reservation.html?k_shopno=9', '서울 강남구 강남대로96길 20 (역삼동, 혜진빌딩) 지하1층', '025087063', '강남', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (17, 2, '건대점', 'http://secretgardenescape.com/reservation.html?k_shopno=5', '서울 광진구 아차산로 235 (화양동) 3층', '024991119', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (18, 2, '포레스트 건대', 'http://secretgardenescape.com/reservation.html?k_shopno=8', '서울 광진구 화양동 8-8 2층', '024684440', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (19, 2, '혜화점', 'http://secretgardenescape.com/reservation.html?k_shopno=4', '서울 종로구 대학로 130 (동숭동, 맥도널드) 지하 1층', '027658899', '혜화', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (20, 2, '시네마틱 혜화', 'http://secretgardenescape.com/reservation.html?k_shopno=11', '서울 종로구 대명길 9 (명륜4가) 지하2층 방탈출', '027633289', '혜화', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (21, 2, '미드나잇 합정', 'http://secretgardenescape.com/reservation.html?k_shopno=7', '서울 마포구 독막로7길 27 (서교동) 3층', '0231446977', '합정', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (22, 2, '서면점', 'http://secretgardenescape.com/reservation.html?k_shopno=3', '부산 부산진구 중앙대로 700 (부전동) 지하1층', '07075430820', '부산', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (23, 2, '동성로', 'http://secretgardenescape.com/reservation.html?k_shopno=6', '대구 중구 동성로5길 55 (삼덕동1가) 4층', '07088230070', '대구', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (24, 2, '광주점', 'http://secretgardenescape.com/reservation.html?k_shopno=10', '광주 동구 충장로 90 (충장로2가, 갤러리존) 4층', '0622267778', '광주', '2021-12-07 16:37:25');

-- 머커파커 지점
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (25, 3, '전주 1호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S1', '전주시 완산구 전동 168-5번지 2층', '01051606542', '전주', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (26, 3, '전주 2호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S2', '전주시 완산구 전동3가 18번지 2층', '01051606542', '전주', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (27, 3, '전주 3호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S4', '전주시 완산구 홍산남로 54 501호', '0632242537', '전주', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (28, 3, '양산점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S3', '경남 양산시 물금읍 범어로 64 (범어리 2711-5 한양프라자) 3층', '01055222737', '양산', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (29, 3, '대구 1호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S5', '대구 중구 동성로3길 7 (봉산동 24-7) 3층', '0532544222', '대구', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (30, 3, '대구 2호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S10', '대구광역시 중구 동성로3길 8 3층', '0532544223', '대구', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (31, 3, '광주점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S7', '광주 동구 충장로안길 14 3층', '0622268788', '광주', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (32, 3, '건대 1호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S6', '서울 광진구 아차산로 213(화양동 48-3) 지하04,05,06호', '024972999', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (33, 3, '건대 2호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S8', '서울 광진구 동일로22길 68(화양동) 지하1층', '024622537', '건대', '2021-12-07 16:37:25');
INSERT INTO BRANCH(BRANCH_ID, STORE_ID, NAME, URL, ADDRESS, PHONE, AREA, CREATE_AT) VALUES (34, 3, '홍대 1호점', 'http://murderparker.com/m/sub_02/sub02_1.html?JIJEM=S9', '서울 마포구 서교동 405-13번지 3층', '07075437303', '홍대', '2021-12-07 16:37:25');

