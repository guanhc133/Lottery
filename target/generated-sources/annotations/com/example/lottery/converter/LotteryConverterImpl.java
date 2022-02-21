package com.example.lottery.converter;

import com.example.lottery.controller.vo.LotteryItemVo;
import com.example.lottery.service.dto.DoDrawDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-08T10:46:41+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class LotteryConverterImpl implements LotteryConverter {

    @Override
    public LotteryItemVo dto2LotteryItemVo(DoDrawDto drawDto) {
        if ( drawDto == null ) {
            return null;
        }

        LotteryItemVo lotteryItemVo = new LotteryItemVo();

        lotteryItemVo.setLotteryId( drawDto.getLotteryId() );
        lotteryItemVo.setAccountIp( drawDto.getAccountIp() );
        lotteryItemVo.setPrizeName( drawDto.getPrizeName() );
        lotteryItemVo.setLevel( drawDto.getLevel() );
        lotteryItemVo.setPrizeId( drawDto.getPrizeId() );

        return lotteryItemVo;
    }
}
