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

public class GJChronology_julianToGregorianByWeekyear_14227810450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term486;

    public GJChronology_julianToGregorianByWeekyear_14227810450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term449 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term450 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 8);
        Object term451 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term454 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term457 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term460 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term463 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term466 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term469 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term472 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term476 = newInstance(Class.forName("java.lang.Object"));
        Object term478 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term481 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term451, term451.getClass(), "iYear", 941650513);
        setLongField(term451, term451.getClass(), "iFirstDayMillis", 2135754395358000892L);
        setElement(term450, 0, term451);
        setIntField(term454, term454.getClass(), "iYear", 444029505);
        setLongField(term454, term454.getClass(), "iFirstDayMillis", -8085190702504231560L);
        setElement(term450, 1, term454);
        setIntField(term457, term457.getClass(), "iYear", -1034506028);
        setLongField(term457, term457.getClass(), "iFirstDayMillis", 1672578078364590450L);
        setElement(term450, 2, term457);
        setIntField(term460, term460.getClass(), "iYear", -1263114719);
        setLongField(term460, term460.getClass(), "iFirstDayMillis", 4949335493504695457L);
        setElement(term450, 3, term460);
        setIntField(term463, term463.getClass(), "iYear", -894662986);
        setLongField(term463, term463.getClass(), "iFirstDayMillis", -5216789073301458893L);
        setElement(term450, 4, term463);
        setIntField(term466, term466.getClass(), "iYear", 304775596);
        setLongField(term466, term466.getClass(), "iFirstDayMillis", -1832940336320585644L);
        setElement(term450, 5, term466);
        setIntField(term469, term469.getClass(), "iYear", -1347665717);
        setLongField(term469, term469.getClass(), "iFirstDayMillis", -8033714905181142681L);
        setElement(term450, 6, term469);
        setIntField(term472, term472.getClass(), "iYear", -1888585309);
        setLongField(term472, term472.getClass(), "iFirstDayMillis", -9040825890007374809L);
        setElement(term450, 7, term472);
        setField(term449, term449.getClass(), "iYearInfoCache", term450);
        setIntField(term449, term449.getClass(), "iMinDaysInFirstWeek", 683666002);
        setField(term449, term449.getClass(), "iBase", null);
        setField(term449, term449.getClass(), "iParam", term476);
        setField(term449, term449.getClass(), "iMillis", null);
        setField(term449, term449.getClass(), "iSeconds", null);
        setField(term449, term449.getClass(), "iMinutes", null);
        setField(term449, term449.getClass(), "iHours", null);
        setField(term449, term449.getClass(), "iHalfdays", null);
        setField(term449, term449.getClass(), "iDays", null);
        setField(term449, term449.getClass(), "iWeeks", null);
        setField(term449, term449.getClass(), "iWeekyears", null);
        setField(term449, term449.getClass(), "iMonths", null);
        setField(term449, term449.getClass(), "iYears", null);
        setField(term449, term449.getClass(), "iCenturies", null);
        setField(term449, term449.getClass(), "iEras", null);
        setField(term449, term449.getClass(), "iMillisOfSecond", null);
        setField(term449, term449.getClass(), "iMillisOfDay", null);
        setField(term449, term449.getClass(), "iSecondOfMinute", null);
        setField(term449, term449.getClass(), "iSecondOfDay", null);
        setField(term449, term449.getClass(), "iMinuteOfHour", null);
        setField(term449, term449.getClass(), "iMinuteOfDay", null);
        setField(term449, term449.getClass(), "iHourOfDay", null);
        setField(term449, term449.getClass(), "iClockhourOfDay", null);
        setField(term449, term449.getClass(), "iHourOfHalfday", null);
        setField(term449, term449.getClass(), "iClockhourOfHalfday", null);
        setField(term449, term449.getClass(), "iHalfdayOfDay", null);
        setField(term449, term449.getClass(), "iDayOfWeek", null);
        setField(term449, term449.getClass(), "iDayOfMonth", null);
        setField(term449, term449.getClass(), "iDayOfYear", null);
        setField(term449, term449.getClass(), "iWeekOfWeekyear", null);
        setField(term449, term449.getClass(), "iWeekyear", null);
        setField(term449, term449.getClass(), "iWeekyearOfCentury", null);
        setField(term449, term449.getClass(), "iMonthOfYear", null);
        setField(term449, term449.getClass(), "iYear", null);
        setField(term449, term449.getClass(), "iYearOfEra", null);
        setField(term449, term449.getClass(), "iYearOfCentury", null);
        setField(term449, term449.getClass(), "iCenturyOfEra", null);
        setField(term449, term449.getClass(), "iEra", null);
        setIntField(term449, term449.getClass(), "iBaseFlags", 0);
        setField(term448, term448.getClass(), "iJulianChronology", term449);
        setField(term478, term478.getClass(), "iYearInfoCache", null);
        setIntField(term478, term478.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term478, term478.getClass(), "iBase", null);
        setField(term478, term478.getClass(), "iParam", null);
        setField(term478, term478.getClass(), "iMillis", null);
        setField(term478, term478.getClass(), "iSeconds", null);
        setField(term478, term478.getClass(), "iMinutes", null);
        setField(term478, term478.getClass(), "iHours", null);
        setField(term478, term478.getClass(), "iHalfdays", null);
        setField(term478, term478.getClass(), "iDays", null);
        setField(term478, term478.getClass(), "iWeeks", null);
        setField(term478, term478.getClass(), "iWeekyears", null);
        setField(term478, term478.getClass(), "iMonths", null);
        setField(term478, term478.getClass(), "iYears", null);
        setField(term478, term478.getClass(), "iCenturies", null);
        setField(term478, term478.getClass(), "iEras", null);
        setField(term478, term478.getClass(), "iMillisOfSecond", null);
        setField(term478, term478.getClass(), "iMillisOfDay", null);
        setField(term478, term478.getClass(), "iSecondOfMinute", null);
        setField(term478, term478.getClass(), "iSecondOfDay", null);
        setField(term478, term478.getClass(), "iMinuteOfHour", null);
        setField(term478, term478.getClass(), "iMinuteOfDay", null);
        setField(term478, term478.getClass(), "iHourOfDay", null);
        setField(term478, term478.getClass(), "iClockhourOfDay", null);
        setField(term478, term478.getClass(), "iHourOfHalfday", null);
        setField(term478, term478.getClass(), "iClockhourOfHalfday", null);
        setField(term478, term478.getClass(), "iHalfdayOfDay", null);
        setField(term478, term478.getClass(), "iDayOfWeek", null);
        setField(term478, term478.getClass(), "iDayOfMonth", null);
        setField(term478, term478.getClass(), "iDayOfYear", null);
        setField(term478, term478.getClass(), "iWeekOfWeekyear", null);
        setField(term478, term478.getClass(), "iWeekyear", null);
        setField(term478, term478.getClass(), "iWeekyearOfCentury", null);
        setField(term478, term478.getClass(), "iMonthOfYear", null);
        setField(term478, term478.getClass(), "iYear", null);
        setField(term478, term478.getClass(), "iYearOfEra", null);
        setField(term478, term478.getClass(), "iYearOfCentury", null);
        setField(term478, term478.getClass(), "iCenturyOfEra", null);
        setField(term478, term478.getClass(), "iEra", null);
        setIntField(term478, term478.getClass(), "iBaseFlags", 0);
        setField(term448, term448.getClass(), "iGregorianChronology", term478);
        setLongField(term481, term481.getClass(), "iMillis", 1790195839605L);
        setField(term448, term448.getClass(), "iCutoverInstant", term481);
        setLongField(term448, term448.getClass(), "iCutoverMillis", 1368340889161782793L);
        setLongField(term448, term448.getClass(), "iGapDuration", -5786861555969446503L);
        setField(term448, term448.getClass(), "iBase", null);
        setField(term448, term448.getClass(), "iParam", null);
        setField(term448, term448.getClass(), "iMillis", null);
        setField(term448, term448.getClass(), "iSeconds", null);
        setField(term448, term448.getClass(), "iMinutes", null);
        setField(term448, term448.getClass(), "iHours", null);
        setField(term448, term448.getClass(), "iHalfdays", null);
        setField(term448, term448.getClass(), "iDays", null);
        setField(term448, term448.getClass(), "iWeeks", null);
        setField(term448, term448.getClass(), "iWeekyears", null);
        setField(term448, term448.getClass(), "iMonths", null);
        setField(term448, term448.getClass(), "iYears", null);
        setField(term448, term448.getClass(), "iCenturies", null);
        setField(term448, term448.getClass(), "iEras", null);
        setField(term448, term448.getClass(), "iMillisOfSecond", null);
        setField(term448, term448.getClass(), "iMillisOfDay", null);
        setField(term448, term448.getClass(), "iSecondOfMinute", null);
        setField(term448, term448.getClass(), "iSecondOfDay", null);
        setField(term448, term448.getClass(), "iMinuteOfHour", null);
        setField(term448, term448.getClass(), "iMinuteOfDay", null);
        setField(term448, term448.getClass(), "iHourOfDay", null);
        setField(term448, term448.getClass(), "iClockhourOfDay", null);
        setField(term448, term448.getClass(), "iHourOfHalfday", null);
        setField(term448, term448.getClass(), "iClockhourOfHalfday", null);
        setField(term448, term448.getClass(), "iHalfdayOfDay", null);
        setField(term448, term448.getClass(), "iDayOfWeek", null);
        setField(term448, term448.getClass(), "iDayOfMonth", null);
        setField(term448, term448.getClass(), "iDayOfYear", null);
        setField(term448, term448.getClass(), "iWeekOfWeekyear", null);
        setField(term448, term448.getClass(), "iWeekyear", null);
        setField(term448, term448.getClass(), "iWeekyearOfCentury", null);
        setField(term448, term448.getClass(), "iMonthOfYear", null);
        setField(term448, term448.getClass(), "iYear", null);
        setField(term448, term448.getClass(), "iYearOfEra", null);
        setField(term448, term448.getClass(), "iYearOfCentury", null);
        setField(term448, term448.getClass(), "iCenturyOfEra", null);
        setField(term448, term448.getClass(), "iEra", null);
        setIntField(term448, term448.getClass(), "iBaseFlags", 0);
        term486 = new Long(2354625302846375590L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term486;
        try {
            callMethod(klass, "julianToGregorianByWeekyear", argTypes, term448, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


