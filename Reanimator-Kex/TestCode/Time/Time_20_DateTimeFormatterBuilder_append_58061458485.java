package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DateTimeFormatterBuilder_append_58061458485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87474;
     Object term87230;

    public DateTimeFormatterBuilder_append_58061458485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87474 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term89948 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term89947 = ((Class) term89948).getDeclaredField((String) "INSTANCE");
        ((Field) term89947).setAccessible(true);
        Object enum31 = ((Field) term89947).get((Object) null);
        Class<? extends Object> term90259 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term90258 = ((Class) term90259).getDeclaredField((String) "INSTANCE");
        ((Field) term90258).setAccessible(true);
        Object enum32 = ((Field) term90258).get((Object) null);
        Class<? extends Object> term90570 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term90569 = ((Class) term90570).getDeclaredField((String) "INSTANCE");
        ((Field) term90569).setAccessible(true);
        Object enum33 = ((Field) term90569).get((Object) null);
        Class<? extends Object> term90881 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term90880 = ((Class) term90881).getDeclaredField((String) "INSTANCE");
        ((Field) term90880).setAccessible(true);
        Object enum34 = ((Field) term90880).get((Object) null);
        term87230 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 9);
        Object term87580 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        Object term88056 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        Object term88304 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral"));
        setElement(term87230, 0, term87580);
        setElement(term87230, 1, enum31);
        setElement(term87230, 2, enum32);
        setElement(term87230, 3, enum33);
        setElement(term87230, 4, enum32);
        setIntField(term88056, term88056.getClass(), "iType", -2);
        setElement(term87230, 5, term88056);
        setElement(term87230, 6, enum34);
        setElement(term87230, 7, term88304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term87230;
        try {
            callMethod(klass, "append", argTypes, term87474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


