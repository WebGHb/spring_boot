create table if not exists soil_info
(
    id  varchar(64) not null  primary key,
    battery                 varchar(64)
);

comment on table soil_info is '土壤信息';

comment on column soil_info.battery is '电池电量';

-----------------------------------------------------------------------------------

create table if not exists station
(
    id varchar(64) not null  primary key ,
    station_code varchar(64) not null ,
    station_name varchar(64) not null ,
    station_type varchar(64) not null
);

comment on table station is '站点信息';
comment on column station.station_id is '站点id';
comment on column station.station_name is '站点名称';
comment on column station.station_type is '站点类型：1:土壤,2:梯度,3:涡度';



-- create table if not exists t_alarm_process
-- (
--     id                       varchar(64) not null
--     constraint t_alarm_process_pk
--     primary key,
--     alarm_id                 varchar(64),
--     alarm_tag                varchar(128),
--     app_audit_user           varchar,
--     handle_user_id           varchar(128),
--     handle_user_display_name varchar(128),
--     handle_content           varchar(2048),
--     pic_url                  varchar,
--     video_url                varchar,
--     process_status           integer,
--     app_user                 varchar,
--     app_cc_user              varchar,
--     message_user             varchar,
--     message_log              varchar(2048),
--     create_time              timestamp default CURRENT_TIMESTAMP
--     );
--
-- comment on table t_alarm_process is '处置流程日志表';
--
-- comment on column t_alarm_process.alarm_id is '告警关联id';
--
-- comment on column t_alarm_process.alarm_tag is '告警名称';
--
-- comment on column t_alarm_process.app_audit_user is '任务下发时选择的审核员姓名，多个用@@@@分隔';
--
-- comment on column t_alarm_process.handle_user_id is '处置人的id';
--
-- comment on column t_alarm_process.handle_user_display_name is '处置人的姓名';
--
-- comment on column t_alarm_process.handle_content is '处置消息';
--
-- comment on column t_alarm_process.pic_url is '处置上传的图片url，多张图片使用@@@@分隔';
--
-- comment on column t_alarm_process.video_url is '处置上传的视频地址';
--
-- comment on column t_alarm_process.process_status is '流程状态：
-- 1-研判
-- 2-签收
-- 3-反馈
-- 4-处置
-- 5-审核通过
-- 6-审核不通过
-- 7-退回
-- 8-推送';
--
-- comment on column t_alarm_process.app_user is '任务下发/退回时选择的app用户，格式为username||||phone_umber,多个用户使用@@@@分隔';
--
-- comment on column t_alarm_process.message_user is '任务下发/退回时选择的短信的用户，格式为username||||phone_umber,多个用户使用@@@@分隔';
--
-- comment on column t_alarm_process.message_log is 'app消息';
-- comment on column t_alarm_process.app_cc_user is '任务下发/退回时选择的app抄送用户，格式为username||||phone_umber,多个用户使用@@@@分隔';
