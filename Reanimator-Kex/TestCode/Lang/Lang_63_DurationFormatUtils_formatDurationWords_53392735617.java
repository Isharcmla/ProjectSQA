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
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Long;
import java.lang.Boolean;

public class DurationFormatUtils_formatDurationWords_53392735617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term57;
     Object term59;

    public DurationFormatUtils_formatDurationWords_53392735617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = new Long(5270370404989704783L);
        term57 = new Boolean(false);
        term59 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term55;
        args[1] = term57;
        args[2] = term59;
        Object retValue = callMethod(klass, "formatDurationWords", argTypes, null, args);
        assertTrue(recursiveEquals(term55, 5270370404989704783L));
        assertTrue(recursiveEquals(term57, false));
        assertTrue(recursiveEquals(term59, false));
        assertTrue(recursiveEquals(retValue, "870115321 days 3 hours 48 minutes 24 seconds"));
    }

};


