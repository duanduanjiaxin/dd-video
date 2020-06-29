package com.dd.common.constants;

import com.dd.common.constants.vo.R;
import com.dd.common.util.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 统一异常处理类
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        //e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return R.error();
    }

    //处理特定异常
    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public R error(BadSqlGrammarException e){
        //e.printStackTrace();
        log.error(ExceptionUtil.getMessage(e));
        return R.setResult(com.guli.common.constants.ResultCodeEnum.BAD_SQL_GRAMMAR);
    }

}
