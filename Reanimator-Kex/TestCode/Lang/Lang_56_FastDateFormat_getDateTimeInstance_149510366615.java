package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FastDateFormat_getDateTimeInstance_149510366615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242;
     Object term1244;
     Object term1246;

    public FastDateFormat_getDateTimeInstance_149510366615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1242 = new Integer(1134449235);
        term1244 = new Integer(-883034806);
        term1246 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term1251 = (long[]) newLongArray(7);
        int[] term1259 = (int[]) newIntArray(4);
        setIntField(term1246, term1246.getClass(), "rawOffset", 10800000);
        setIntField(term1246, term1246.getClass(), "rawOffsetDiff", 0);
        setIntField(term1246, term1246.getClass(), "checksum", -1382808297);
        setIntField(term1246, term1246.getClass(), "dstSavings", 0);
        setLongElement(term1251, 0, -9048018124799999L);
        setLongElement(term1251, 1, -7971507552255998L);
        setLongElement(term1251, 2, -5364722073600000L);
        setLongElement(term1251, 3, -5169025843199998L);
        setLongElement(term1251, 4, -4265526067199997L);
        setLongElement(term1251, 5, -3544292966400000L);
        setLongElement(term1251, 6, 8660459520000000L);
        setField(term1246, term1246.getClass(), "transitions", term1251);
        setIntElement(term1259, 0, 10800000);
        setIntElement(term1259, 1, 8836000);
        setIntElement(term1259, 2, 9000000);
        setIntElement(term1259, 3, 9900000);
        setField(term1246, term1246.getClass(), "offsets", term1259);
        setField(term1246, term1246.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1246, term1246.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1246, term1246.getClass(), "dirty", false);
        setField(term1246, term1246.getClass(), "lastRule", null);
        setField(term1246, term1246.getClass(), "ID", "Africa/Mogadishu");
        setField(term1246, term1246.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[3];
        args[0] = term1242;
        args[1] = term1244;
        args[2] = term1246;
        callMethod(klass, "getDateTimeInstance", argTypes, null, args);
    }

};


