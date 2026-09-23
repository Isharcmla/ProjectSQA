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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_canBuildPrinter_974927415431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71403;
     Object term71504;

    public DateTimeFormatterBuilder_canBuildPrinter_974927415431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term71455 = new ArrayList();
        ((ArrayList) term71455).add((Object)null);
        ((ArrayList) term71455).add((Object)null);
        term71403 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term71403, term71403.getClass(), "iFormatter", null);
        setField(term71403, term71403.getClass(), "iElementPairs", term71455);
        ArrayList term71505 = new ArrayList();
        ((ArrayList) term71505).add((Object)null);
        ((ArrayList) term71505).add((Object)null);
        term71504 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term71507 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term71504, term71504.getClass(), "iElementPairs", term71505);
        setField(term71507, term71507.getClass(), "iPrinters", null);
        setField(term71507, term71507.getClass(), "iParsers", null);
        setIntField(term71507, term71507.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term71507, term71507.getClass(), "iParsedLengthEstimate", 0);
        setField(term71504, term71504.getClass(), "iFormatter", term71507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildPrinter", argTypes, term71403, args);
        assertTrue(recursiveEquals(term71403, term71504));
    }

};


