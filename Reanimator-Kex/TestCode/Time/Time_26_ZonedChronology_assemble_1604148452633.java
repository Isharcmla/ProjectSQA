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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328804;
     Object term328980;

    public ZonedChronology_assemble_1604148452633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328804 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term328880 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term328804, term328804.getClass(), "iParam", term328880);
        term328980 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term329084 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term329204 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term329308 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term328980, term328980.getClass(), "eras", null);
        setField(term328980, term328980.getClass(), "centuries", null);
        setField(term328980, term328980.getClass(), "years", null);
        setField(term328980, term328980.getClass(), "months", null);
        setField(term328980, term328980.getClass(), "weekyears", null);
        setField(term328980, term328980.getClass(), "weeks", null);
        setField(term328980, term328980.getClass(), "days", null);
        setField(term328980, term328980.getClass(), "halfdays", null);
        setField(term328980, term328980.getClass(), "hours", null);
        setField(term328980, term328980.getClass(), "minutes", null);
        setField(term328980, term328980.getClass(), "seconds", null);
        setField(term328980, term328980.getClass(), "millis", null);
        setField(term328980, term328980.getClass(), "year", null);
        setField(term328980, term328980.getClass(), "yearOfEra", null);
        setField(term329084, term329084.getClass(), "iUnitField", null);
        setField(term329084, term329084.getClass(), "iRangeField", null);
        setField(term329084, term329084.getClass(), "iType", term329204);
        setField(term328980, term328980.getClass(), "yearOfCentury", term329084);
        setField(term328980, term328980.getClass(), "centuryOfEra", null);
        setField(term328980, term328980.getClass(), "era", null);
        setField(term328980, term328980.getClass(), "dayOfWeek", null);
        setField(term328980, term328980.getClass(), "dayOfMonth", null);
        setField(term328980, term328980.getClass(), "dayOfYear", null);
        setField(term328980, term328980.getClass(), "monthOfYear", null);
        setField(term328980, term328980.getClass(), "weekOfWeekyear", null);
        setField(term328980, term328980.getClass(), "weekyear", null);
        setField(term328980, term328980.getClass(), "weekyearOfCentury", null);
        setField(term328980, term328980.getClass(), "millisOfSecond", term329308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term328980;
        try {
            callMethod(klass, "assemble", argTypes, term328804, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


