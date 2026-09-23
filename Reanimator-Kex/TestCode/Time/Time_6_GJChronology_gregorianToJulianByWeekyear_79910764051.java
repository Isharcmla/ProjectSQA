package org.joda.time.chrono;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class GJChronology_gregorianToJulianByWeekyear_79910764051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;
     Object term520;

    public GJChronology_gregorianToJulianByWeekyear_79910764051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term489 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term490 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 6);
        Object term491 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term494 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term497 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term500 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term503 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term506 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term510 = newInstance(Class.forName("java.lang.Object"));
        Object term512 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term515 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term491, term491.getClass(), "iYear", 1596213415);
        setLongField(term491, term491.getClass(), "iFirstDayMillis", 7276637106827860087L);
        setElement(term490, 0, term491);
        setIntField(term494, term494.getClass(), "iYear", -268815336);
        setLongField(term494, term494.getClass(), "iFirstDayMillis", -3936701866695933852L);
        setElement(term490, 1, term494);
        setIntField(term497, term497.getClass(), "iYear", -1210583429);
        setLongField(term497, term497.getClass(), "iFirstDayMillis", 1215116475929634177L);
        setElement(term490, 2, term497);
        setIntField(term500, term500.getClass(), "iYear", -663691365);
        setLongField(term500, term500.getClass(), "iFirstDayMillis", 1597484336218508869L);
        setElement(term490, 3, term500);
        setIntField(term503, term503.getClass(), "iYear", 339854490);
        setLongField(term503, term503.getClass(), "iFirstDayMillis", -685023850445639859L);
        setElement(term490, 4, term503);
        setIntField(term506, term506.getClass(), "iYear", -615654495);
        setLongField(term506, term506.getClass(), "iFirstDayMillis", -6950146046121430355L);
        setElement(term490, 5, term506);
        setField(term489, term489.getClass(), "iYearInfoCache", term490);
        setIntField(term489, term489.getClass(), "iMinDaysInFirstWeek", -1476117762);
        setField(term489, term489.getClass(), "iBase", null);
        setField(term489, term489.getClass(), "iParam", term510);
        setField(term489, term489.getClass(), "iMillis", null);
        setField(term489, term489.getClass(), "iSeconds", null);
        setField(term489, term489.getClass(), "iMinutes", null);
        setField(term489, term489.getClass(), "iHours", null);
        setField(term489, term489.getClass(), "iHalfdays", null);
        setField(term489, term489.getClass(), "iDays", null);
        setField(term489, term489.getClass(), "iWeeks", null);
        setField(term489, term489.getClass(), "iWeekyears", null);
        setField(term489, term489.getClass(), "iMonths", null);
        setField(term489, term489.getClass(), "iYears", null);
        setField(term489, term489.getClass(), "iCenturies", null);
        setField(term489, term489.getClass(), "iEras", null);
        setField(term489, term489.getClass(), "iMillisOfSecond", null);
        setField(term489, term489.getClass(), "iMillisOfDay", null);
        setField(term489, term489.getClass(), "iSecondOfMinute", null);
        setField(term489, term489.getClass(), "iSecondOfDay", null);
        setField(term489, term489.getClass(), "iMinuteOfHour", null);
        setField(term489, term489.getClass(), "iMinuteOfDay", null);
        setField(term489, term489.getClass(), "iHourOfDay", null);
        setField(term489, term489.getClass(), "iClockhourOfDay", null);
        setField(term489, term489.getClass(), "iHourOfHalfday", null);
        setField(term489, term489.getClass(), "iClockhourOfHalfday", null);
        setField(term489, term489.getClass(), "iHalfdayOfDay", null);
        setField(term489, term489.getClass(), "iDayOfWeek", null);
        setField(term489, term489.getClass(), "iDayOfMonth", null);
        setField(term489, term489.getClass(), "iDayOfYear", null);
        setField(term489, term489.getClass(), "iWeekOfWeekyear", null);
        setField(term489, term489.getClass(), "iWeekyear", null);
        setField(term489, term489.getClass(), "iWeekyearOfCentury", null);
        setField(term489, term489.getClass(), "iMonthOfYear", null);
        setField(term489, term489.getClass(), "iYear", null);
        setField(term489, term489.getClass(), "iYearOfEra", null);
        setField(term489, term489.getClass(), "iYearOfCentury", null);
        setField(term489, term489.getClass(), "iCenturyOfEra", null);
        setField(term489, term489.getClass(), "iEra", null);
        setIntField(term489, term489.getClass(), "iBaseFlags", 0);
        setField(term488, term488.getClass(), "iJulianChronology", term489);
        setField(term512, term512.getClass(), "iYearInfoCache", null);
        setIntField(term512, term512.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term512, term512.getClass(), "iBase", null);
        setField(term512, term512.getClass(), "iParam", null);
        setField(term512, term512.getClass(), "iMillis", null);
        setField(term512, term512.getClass(), "iSeconds", null);
        setField(term512, term512.getClass(), "iMinutes", null);
        setField(term512, term512.getClass(), "iHours", null);
        setField(term512, term512.getClass(), "iHalfdays", null);
        setField(term512, term512.getClass(), "iDays", null);
        setField(term512, term512.getClass(), "iWeeks", null);
        setField(term512, term512.getClass(), "iWeekyears", null);
        setField(term512, term512.getClass(), "iMonths", null);
        setField(term512, term512.getClass(), "iYears", null);
        setField(term512, term512.getClass(), "iCenturies", null);
        setField(term512, term512.getClass(), "iEras", null);
        setField(term512, term512.getClass(), "iMillisOfSecond", null);
        setField(term512, term512.getClass(), "iMillisOfDay", null);
        setField(term512, term512.getClass(), "iSecondOfMinute", null);
        setField(term512, term512.getClass(), "iSecondOfDay", null);
        setField(term512, term512.getClass(), "iMinuteOfHour", null);
        setField(term512, term512.getClass(), "iMinuteOfDay", null);
        setField(term512, term512.getClass(), "iHourOfDay", null);
        setField(term512, term512.getClass(), "iClockhourOfDay", null);
        setField(term512, term512.getClass(), "iHourOfHalfday", null);
        setField(term512, term512.getClass(), "iClockhourOfHalfday", null);
        setField(term512, term512.getClass(), "iHalfdayOfDay", null);
        setField(term512, term512.getClass(), "iDayOfWeek", null);
        setField(term512, term512.getClass(), "iDayOfMonth", null);
        setField(term512, term512.getClass(), "iDayOfYear", null);
        setField(term512, term512.getClass(), "iWeekOfWeekyear", null);
        setField(term512, term512.getClass(), "iWeekyear", null);
        setField(term512, term512.getClass(), "iWeekyearOfCentury", null);
        setField(term512, term512.getClass(), "iMonthOfYear", null);
        setField(term512, term512.getClass(), "iYear", null);
        setField(term512, term512.getClass(), "iYearOfEra", null);
        setField(term512, term512.getClass(), "iYearOfCentury", null);
        setField(term512, term512.getClass(), "iCenturyOfEra", null);
        setField(term512, term512.getClass(), "iEra", null);
        setIntField(term512, term512.getClass(), "iBaseFlags", 0);
        setField(term488, term488.getClass(), "iGregorianChronology", term512);
        setLongField(term515, term515.getClass(), "iMillis", 1790192412013L);
        setField(term488, term488.getClass(), "iCutoverInstant", term515);
        setLongField(term488, term488.getClass(), "iCutoverMillis", 1667122142089513324L);
        setLongField(term488, term488.getClass(), "iGapDuration", -6342139649364011743L);
        setField(term488, term488.getClass(), "iBase", null);
        setField(term488, term488.getClass(), "iParam", null);
        setField(term488, term488.getClass(), "iMillis", null);
        setField(term488, term488.getClass(), "iSeconds", null);
        setField(term488, term488.getClass(), "iMinutes", null);
        setField(term488, term488.getClass(), "iHours", null);
        setField(term488, term488.getClass(), "iHalfdays", null);
        setField(term488, term488.getClass(), "iDays", null);
        setField(term488, term488.getClass(), "iWeeks", null);
        setField(term488, term488.getClass(), "iWeekyears", null);
        setField(term488, term488.getClass(), "iMonths", null);
        setField(term488, term488.getClass(), "iYears", null);
        setField(term488, term488.getClass(), "iCenturies", null);
        setField(term488, term488.getClass(), "iEras", null);
        setField(term488, term488.getClass(), "iMillisOfSecond", null);
        setField(term488, term488.getClass(), "iMillisOfDay", null);
        setField(term488, term488.getClass(), "iSecondOfMinute", null);
        setField(term488, term488.getClass(), "iSecondOfDay", null);
        setField(term488, term488.getClass(), "iMinuteOfHour", null);
        setField(term488, term488.getClass(), "iMinuteOfDay", null);
        setField(term488, term488.getClass(), "iHourOfDay", null);
        setField(term488, term488.getClass(), "iClockhourOfDay", null);
        setField(term488, term488.getClass(), "iHourOfHalfday", null);
        setField(term488, term488.getClass(), "iClockhourOfHalfday", null);
        setField(term488, term488.getClass(), "iHalfdayOfDay", null);
        setField(term488, term488.getClass(), "iDayOfWeek", null);
        setField(term488, term488.getClass(), "iDayOfMonth", null);
        setField(term488, term488.getClass(), "iDayOfYear", null);
        setField(term488, term488.getClass(), "iWeekOfWeekyear", null);
        setField(term488, term488.getClass(), "iWeekyear", null);
        setField(term488, term488.getClass(), "iWeekyearOfCentury", null);
        setField(term488, term488.getClass(), "iMonthOfYear", null);
        setField(term488, term488.getClass(), "iYear", null);
        setField(term488, term488.getClass(), "iYearOfEra", null);
        setField(term488, term488.getClass(), "iYearOfCentury", null);
        setField(term488, term488.getClass(), "iCenturyOfEra", null);
        setField(term488, term488.getClass(), "iEra", null);
        setIntField(term488, term488.getClass(), "iBaseFlags", 0);
        term520 = new Long(-4924950707540628022L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term520;
        try {
            callMethod(klass, "gregorianToJulianByWeekyear", argTypes, term488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


