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
import org.joda.time.IllegalFieldValueException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GJChronology_getDateTimeMillis_29445480140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term219;
     Object term221;
     Object term223;
     Object term225;

    public GJChronology_getDateTimeMillis_29445480140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term185 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term186 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 7);
        Object term187 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term190 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term193 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term196 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term199 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term202 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term205 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term209 = newInstance(Class.forName("java.lang.Object"));
        Object term211 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term214 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term187, term187.getClass(), "iYear", 767834723);
        setLongField(term187, term187.getClass(), "iFirstDayMillis", -6292278961887936280L);
        setElement(term186, 0, term187);
        setIntField(term190, term190.getClass(), "iYear", -602026508);
        setLongField(term190, term190.getClass(), "iFirstDayMillis", -6645965768855543712L);
        setElement(term186, 1, term190);
        setIntField(term193, term193.getClass(), "iYear", -157887805);
        setLongField(term193, term193.getClass(), "iFirstDayMillis", 4784595517102746672L);
        setElement(term186, 2, term193);
        setIntField(term196, term196.getClass(), "iYear", 1876565163);
        setLongField(term196, term196.getClass(), "iFirstDayMillis", -7612550318181586304L);
        setElement(term186, 3, term196);
        setIntField(term199, term199.getClass(), "iYear", -817164822);
        setLongField(term199, term199.getClass(), "iFirstDayMillis", -2170847986967241072L);
        setElement(term186, 4, term199);
        setIntField(term202, term202.getClass(), "iYear", -1016503459);
        setLongField(term202, term202.getClass(), "iFirstDayMillis", 4044358158040652353L);
        setElement(term186, 5, term202);
        setIntField(term205, term205.getClass(), "iYear", -1968847291);
        setLongField(term205, term205.getClass(), "iFirstDayMillis", -4443169559037975007L);
        setElement(term186, 6, term205);
        setField(term185, term185.getClass(), "iYearInfoCache", term186);
        setIntField(term185, term185.getClass(), "iMinDaysInFirstWeek", 579005622);
        setField(term185, term185.getClass(), "iBase", null);
        setField(term185, term185.getClass(), "iParam", term209);
        setField(term185, term185.getClass(), "iMillis", null);
        setField(term185, term185.getClass(), "iSeconds", null);
        setField(term185, term185.getClass(), "iMinutes", null);
        setField(term185, term185.getClass(), "iHours", null);
        setField(term185, term185.getClass(), "iHalfdays", null);
        setField(term185, term185.getClass(), "iDays", null);
        setField(term185, term185.getClass(), "iWeeks", null);
        setField(term185, term185.getClass(), "iWeekyears", null);
        setField(term185, term185.getClass(), "iMonths", null);
        setField(term185, term185.getClass(), "iYears", null);
        setField(term185, term185.getClass(), "iCenturies", null);
        setField(term185, term185.getClass(), "iEras", null);
        setField(term185, term185.getClass(), "iMillisOfSecond", null);
        setField(term185, term185.getClass(), "iMillisOfDay", null);
        setField(term185, term185.getClass(), "iSecondOfMinute", null);
        setField(term185, term185.getClass(), "iSecondOfDay", null);
        setField(term185, term185.getClass(), "iMinuteOfHour", null);
        setField(term185, term185.getClass(), "iMinuteOfDay", null);
        setField(term185, term185.getClass(), "iHourOfDay", null);
        setField(term185, term185.getClass(), "iClockhourOfDay", null);
        setField(term185, term185.getClass(), "iHourOfHalfday", null);
        setField(term185, term185.getClass(), "iClockhourOfHalfday", null);
        setField(term185, term185.getClass(), "iHalfdayOfDay", null);
        setField(term185, term185.getClass(), "iDayOfWeek", null);
        setField(term185, term185.getClass(), "iDayOfMonth", null);
        setField(term185, term185.getClass(), "iDayOfYear", null);
        setField(term185, term185.getClass(), "iWeekOfWeekyear", null);
        setField(term185, term185.getClass(), "iWeekyear", null);
        setField(term185, term185.getClass(), "iWeekyearOfCentury", null);
        setField(term185, term185.getClass(), "iMonthOfYear", null);
        setField(term185, term185.getClass(), "iYear", null);
        setField(term185, term185.getClass(), "iYearOfEra", null);
        setField(term185, term185.getClass(), "iYearOfCentury", null);
        setField(term185, term185.getClass(), "iCenturyOfEra", null);
        setField(term185, term185.getClass(), "iEra", null);
        setIntField(term185, term185.getClass(), "iBaseFlags", 0);
        setField(term184, term184.getClass(), "iJulianChronology", term185);
        setField(term211, term211.getClass(), "iYearInfoCache", null);
        setIntField(term211, term211.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term211, term211.getClass(), "iBase", null);
        setField(term211, term211.getClass(), "iParam", null);
        setField(term211, term211.getClass(), "iMillis", null);
        setField(term211, term211.getClass(), "iSeconds", null);
        setField(term211, term211.getClass(), "iMinutes", null);
        setField(term211, term211.getClass(), "iHours", null);
        setField(term211, term211.getClass(), "iHalfdays", null);
        setField(term211, term211.getClass(), "iDays", null);
        setField(term211, term211.getClass(), "iWeeks", null);
        setField(term211, term211.getClass(), "iWeekyears", null);
        setField(term211, term211.getClass(), "iMonths", null);
        setField(term211, term211.getClass(), "iYears", null);
        setField(term211, term211.getClass(), "iCenturies", null);
        setField(term211, term211.getClass(), "iEras", null);
        setField(term211, term211.getClass(), "iMillisOfSecond", null);
        setField(term211, term211.getClass(), "iMillisOfDay", null);
        setField(term211, term211.getClass(), "iSecondOfMinute", null);
        setField(term211, term211.getClass(), "iSecondOfDay", null);
        setField(term211, term211.getClass(), "iMinuteOfHour", null);
        setField(term211, term211.getClass(), "iMinuteOfDay", null);
        setField(term211, term211.getClass(), "iHourOfDay", null);
        setField(term211, term211.getClass(), "iClockhourOfDay", null);
        setField(term211, term211.getClass(), "iHourOfHalfday", null);
        setField(term211, term211.getClass(), "iClockhourOfHalfday", null);
        setField(term211, term211.getClass(), "iHalfdayOfDay", null);
        setField(term211, term211.getClass(), "iDayOfWeek", null);
        setField(term211, term211.getClass(), "iDayOfMonth", null);
        setField(term211, term211.getClass(), "iDayOfYear", null);
        setField(term211, term211.getClass(), "iWeekOfWeekyear", null);
        setField(term211, term211.getClass(), "iWeekyear", null);
        setField(term211, term211.getClass(), "iWeekyearOfCentury", null);
        setField(term211, term211.getClass(), "iMonthOfYear", null);
        setField(term211, term211.getClass(), "iYear", null);
        setField(term211, term211.getClass(), "iYearOfEra", null);
        setField(term211, term211.getClass(), "iYearOfCentury", null);
        setField(term211, term211.getClass(), "iCenturyOfEra", null);
        setField(term211, term211.getClass(), "iEra", null);
        setIntField(term211, term211.getClass(), "iBaseFlags", 0);
        setField(term184, term184.getClass(), "iGregorianChronology", term211);
        setLongField(term214, term214.getClass(), "iMillis", 1790195839062L);
        setField(term184, term184.getClass(), "iCutoverInstant", term214);
        setLongField(term184, term184.getClass(), "iCutoverMillis", -3842548265506930260L);
        setLongField(term184, term184.getClass(), "iGapDuration", -5788180182343976541L);
        setField(term184, term184.getClass(), "iBase", null);
        setField(term184, term184.getClass(), "iParam", null);
        setField(term184, term184.getClass(), "iMillis", null);
        setField(term184, term184.getClass(), "iSeconds", null);
        setField(term184, term184.getClass(), "iMinutes", null);
        setField(term184, term184.getClass(), "iHours", null);
        setField(term184, term184.getClass(), "iHalfdays", null);
        setField(term184, term184.getClass(), "iDays", null);
        setField(term184, term184.getClass(), "iWeeks", null);
        setField(term184, term184.getClass(), "iWeekyears", null);
        setField(term184, term184.getClass(), "iMonths", null);
        setField(term184, term184.getClass(), "iYears", null);
        setField(term184, term184.getClass(), "iCenturies", null);
        setField(term184, term184.getClass(), "iEras", null);
        setField(term184, term184.getClass(), "iMillisOfSecond", null);
        setField(term184, term184.getClass(), "iMillisOfDay", null);
        setField(term184, term184.getClass(), "iSecondOfMinute", null);
        setField(term184, term184.getClass(), "iSecondOfDay", null);
        setField(term184, term184.getClass(), "iMinuteOfHour", null);
        setField(term184, term184.getClass(), "iMinuteOfDay", null);
        setField(term184, term184.getClass(), "iHourOfDay", null);
        setField(term184, term184.getClass(), "iClockhourOfDay", null);
        setField(term184, term184.getClass(), "iHourOfHalfday", null);
        setField(term184, term184.getClass(), "iClockhourOfHalfday", null);
        setField(term184, term184.getClass(), "iHalfdayOfDay", null);
        setField(term184, term184.getClass(), "iDayOfWeek", null);
        setField(term184, term184.getClass(), "iDayOfMonth", null);
        setField(term184, term184.getClass(), "iDayOfYear", null);
        setField(term184, term184.getClass(), "iWeekOfWeekyear", null);
        setField(term184, term184.getClass(), "iWeekyear", null);
        setField(term184, term184.getClass(), "iWeekyearOfCentury", null);
        setField(term184, term184.getClass(), "iMonthOfYear", null);
        setField(term184, term184.getClass(), "iYear", null);
        setField(term184, term184.getClass(), "iYearOfEra", null);
        setField(term184, term184.getClass(), "iYearOfCentury", null);
        setField(term184, term184.getClass(), "iCenturyOfEra", null);
        setField(term184, term184.getClass(), "iEra", null);
        setIntField(term184, term184.getClass(), "iBaseFlags", 0);
        term219 = new Integer(-14890619);
        term221 = new Integer(1632125673);
        term223 = new Integer(454281060);
        term225 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term219;
        args[1] = term221;
        args[2] = term223;
        args[3] = term225;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term184, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


