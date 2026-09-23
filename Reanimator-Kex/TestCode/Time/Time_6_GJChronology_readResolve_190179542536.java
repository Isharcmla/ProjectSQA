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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GJChronology_readResolve_190179542536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;

    public GJChronology_readResolve_190179542536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term84 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object[] term85 = (Object[]) newArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        Object term86 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$YearInfo"));
        Object term90 = newInstance(Class.forName("java.lang.Object"));
        Object term92 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term95 = newInstance(Class.forName("org.joda.time.Instant"));
        setIntField(term86, term86.getClass(), "iYear", -2068769794);
        setLongField(term86, term86.getClass(), "iFirstDayMillis", -4920224193275732920L);
        setElement(term85, 0, term86);
        setField(term84, term84.getClass(), "iYearInfoCache", term85);
        setIntField(term84, term84.getClass(), "iMinDaysInFirstWeek", -117576464);
        setField(term84, term84.getClass(), "iBase", null);
        setField(term84, term84.getClass(), "iParam", term90);
        setField(term84, term84.getClass(), "iMillis", null);
        setField(term84, term84.getClass(), "iSeconds", null);
        setField(term84, term84.getClass(), "iMinutes", null);
        setField(term84, term84.getClass(), "iHours", null);
        setField(term84, term84.getClass(), "iHalfdays", null);
        setField(term84, term84.getClass(), "iDays", null);
        setField(term84, term84.getClass(), "iWeeks", null);
        setField(term84, term84.getClass(), "iWeekyears", null);
        setField(term84, term84.getClass(), "iMonths", null);
        setField(term84, term84.getClass(), "iYears", null);
        setField(term84, term84.getClass(), "iCenturies", null);
        setField(term84, term84.getClass(), "iEras", null);
        setField(term84, term84.getClass(), "iMillisOfSecond", null);
        setField(term84, term84.getClass(), "iMillisOfDay", null);
        setField(term84, term84.getClass(), "iSecondOfMinute", null);
        setField(term84, term84.getClass(), "iSecondOfDay", null);
        setField(term84, term84.getClass(), "iMinuteOfHour", null);
        setField(term84, term84.getClass(), "iMinuteOfDay", null);
        setField(term84, term84.getClass(), "iHourOfDay", null);
        setField(term84, term84.getClass(), "iClockhourOfDay", null);
        setField(term84, term84.getClass(), "iHourOfHalfday", null);
        setField(term84, term84.getClass(), "iClockhourOfHalfday", null);
        setField(term84, term84.getClass(), "iHalfdayOfDay", null);
        setField(term84, term84.getClass(), "iDayOfWeek", null);
        setField(term84, term84.getClass(), "iDayOfMonth", null);
        setField(term84, term84.getClass(), "iDayOfYear", null);
        setField(term84, term84.getClass(), "iWeekOfWeekyear", null);
        setField(term84, term84.getClass(), "iWeekyear", null);
        setField(term84, term84.getClass(), "iWeekyearOfCentury", null);
        setField(term84, term84.getClass(), "iMonthOfYear", null);
        setField(term84, term84.getClass(), "iYear", null);
        setField(term84, term84.getClass(), "iYearOfEra", null);
        setField(term84, term84.getClass(), "iYearOfCentury", null);
        setField(term84, term84.getClass(), "iCenturyOfEra", null);
        setField(term84, term84.getClass(), "iEra", null);
        setIntField(term84, term84.getClass(), "iBaseFlags", 0);
        setField(term83, term83.getClass(), "iJulianChronology", term84);
        setField(term92, term92.getClass(), "iYearInfoCache", null);
        setIntField(term92, term92.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term92, term92.getClass(), "iBase", null);
        setField(term92, term92.getClass(), "iParam", null);
        setField(term92, term92.getClass(), "iMillis", null);
        setField(term92, term92.getClass(), "iSeconds", null);
        setField(term92, term92.getClass(), "iMinutes", null);
        setField(term92, term92.getClass(), "iHours", null);
        setField(term92, term92.getClass(), "iHalfdays", null);
        setField(term92, term92.getClass(), "iDays", null);
        setField(term92, term92.getClass(), "iWeeks", null);
        setField(term92, term92.getClass(), "iWeekyears", null);
        setField(term92, term92.getClass(), "iMonths", null);
        setField(term92, term92.getClass(), "iYears", null);
        setField(term92, term92.getClass(), "iCenturies", null);
        setField(term92, term92.getClass(), "iEras", null);
        setField(term92, term92.getClass(), "iMillisOfSecond", null);
        setField(term92, term92.getClass(), "iMillisOfDay", null);
        setField(term92, term92.getClass(), "iSecondOfMinute", null);
        setField(term92, term92.getClass(), "iSecondOfDay", null);
        setField(term92, term92.getClass(), "iMinuteOfHour", null);
        setField(term92, term92.getClass(), "iMinuteOfDay", null);
        setField(term92, term92.getClass(), "iHourOfDay", null);
        setField(term92, term92.getClass(), "iClockhourOfDay", null);
        setField(term92, term92.getClass(), "iHourOfHalfday", null);
        setField(term92, term92.getClass(), "iClockhourOfHalfday", null);
        setField(term92, term92.getClass(), "iHalfdayOfDay", null);
        setField(term92, term92.getClass(), "iDayOfWeek", null);
        setField(term92, term92.getClass(), "iDayOfMonth", null);
        setField(term92, term92.getClass(), "iDayOfYear", null);
        setField(term92, term92.getClass(), "iWeekOfWeekyear", null);
        setField(term92, term92.getClass(), "iWeekyear", null);
        setField(term92, term92.getClass(), "iWeekyearOfCentury", null);
        setField(term92, term92.getClass(), "iMonthOfYear", null);
        setField(term92, term92.getClass(), "iYear", null);
        setField(term92, term92.getClass(), "iYearOfEra", null);
        setField(term92, term92.getClass(), "iYearOfCentury", null);
        setField(term92, term92.getClass(), "iCenturyOfEra", null);
        setField(term92, term92.getClass(), "iEra", null);
        setIntField(term92, term92.getClass(), "iBaseFlags", 0);
        setField(term83, term83.getClass(), "iGregorianChronology", term92);
        setLongField(term95, term95.getClass(), "iMillis", 1790192410868L);
        setField(term83, term83.getClass(), "iCutoverInstant", term95);
        setLongField(term83, term83.getClass(), "iCutoverMillis", 8428634514691209827L);
        setLongField(term83, term83.getClass(), "iGapDuration", -2585684163342970173L);
        setField(term83, term83.getClass(), "iBase", null);
        setField(term83, term83.getClass(), "iParam", null);
        setField(term83, term83.getClass(), "iMillis", null);
        setField(term83, term83.getClass(), "iSeconds", null);
        setField(term83, term83.getClass(), "iMinutes", null);
        setField(term83, term83.getClass(), "iHours", null);
        setField(term83, term83.getClass(), "iHalfdays", null);
        setField(term83, term83.getClass(), "iDays", null);
        setField(term83, term83.getClass(), "iWeeks", null);
        setField(term83, term83.getClass(), "iWeekyears", null);
        setField(term83, term83.getClass(), "iMonths", null);
        setField(term83, term83.getClass(), "iYears", null);
        setField(term83, term83.getClass(), "iCenturies", null);
        setField(term83, term83.getClass(), "iEras", null);
        setField(term83, term83.getClass(), "iMillisOfSecond", null);
        setField(term83, term83.getClass(), "iMillisOfDay", null);
        setField(term83, term83.getClass(), "iSecondOfMinute", null);
        setField(term83, term83.getClass(), "iSecondOfDay", null);
        setField(term83, term83.getClass(), "iMinuteOfHour", null);
        setField(term83, term83.getClass(), "iMinuteOfDay", null);
        setField(term83, term83.getClass(), "iHourOfDay", null);
        setField(term83, term83.getClass(), "iClockhourOfDay", null);
        setField(term83, term83.getClass(), "iHourOfHalfday", null);
        setField(term83, term83.getClass(), "iClockhourOfHalfday", null);
        setField(term83, term83.getClass(), "iHalfdayOfDay", null);
        setField(term83, term83.getClass(), "iDayOfWeek", null);
        setField(term83, term83.getClass(), "iDayOfMonth", null);
        setField(term83, term83.getClass(), "iDayOfYear", null);
        setField(term83, term83.getClass(), "iWeekOfWeekyear", null);
        setField(term83, term83.getClass(), "iWeekyear", null);
        setField(term83, term83.getClass(), "iWeekyearOfCentury", null);
        setField(term83, term83.getClass(), "iMonthOfYear", null);
        setField(term83, term83.getClass(), "iYear", null);
        setField(term83, term83.getClass(), "iYearOfEra", null);
        setField(term83, term83.getClass(), "iYearOfCentury", null);
        setField(term83, term83.getClass(), "iCenturyOfEra", null);
        setField(term83, term83.getClass(), "iEra", null);
        setIntField(term83, term83.getClass(), "iBaseFlags", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readResolve", argTypes, term83, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


