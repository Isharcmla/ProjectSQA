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
import java.lang.Long;
import java.lang.Boolean;

public class DurationFormatUtils_formatPeriod_5168754168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term93;
     Object term107;
     Object term109;

    public DurationFormatUtils_formatPeriod_5168754168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = new Long(6967924379644551255L);
        term93 = new Long(-2813493605142626659L);
        term107 = new Boolean(false);
        term109 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term109, term109.getClass(), "rawOffset", 18000000);
        setIntField(term109, term109.getClass(), "rawOffsetDiff", 0);
        setIntField(term109, term109.getClass(), "checksum", 0);
        setIntField(term109, term109.getClass(), "dstSavings", 0);
        setField(term109, term109.getClass(), "transitions", null);
        setField(term109, term109.getClass(), "offsets", null);
        setField(term109, term109.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term109, term109.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term109, term109.getClass(), "dirty", false);
        setField(term109, term109.getClass(), "lastRule", null);
        setField(term109, term109.getClass(), "ID", "Etc/GMT-5");
        setField(term109, term109.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[5];
        args[0] = term91;
        args[1] = term93;
        args[2] = "xxtlPwDYFs";
        args[3] = term107;
        args[4] = term109;
        callMethod(klass, "formatPeriod", argTypes, null, args);
    }

};


