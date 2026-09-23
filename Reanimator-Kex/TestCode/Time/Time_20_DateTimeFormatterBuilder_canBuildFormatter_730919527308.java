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

public class DateTimeFormatterBuilder_canBuildFormatter_730919527308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45529;
     Object term45875;

    public DateTimeFormatterBuilder_canBuildFormatter_730919527308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term45581 = new ArrayList();
        term45529 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term45529, term45529.getClass(), "iFormatter", null);
        setField(term45529, term45529.getClass(), "iElementPairs", term45581);
        ArrayList term45876 = new ArrayList();
        term45875 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term45878 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term45875, term45875.getClass(), "iElementPairs", term45876);
        setField(term45878, term45878.getClass(), "iPrinters", null);
        setField(term45878, term45878.getClass(), "iParsers", null);
        setIntField(term45878, term45878.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term45878, term45878.getClass(), "iParsedLengthEstimate", 0);
        setField(term45875, term45875.getClass(), "iFormatter", term45878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term45529, args);
        assertTrue(recursiveEquals(term45529, term45875));
    }

};


