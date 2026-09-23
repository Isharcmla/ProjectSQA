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

public class DateTimeFormatterBuilder_canBuildFormatter_730919527425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67992;
     Object term68104;

    public DateTimeFormatterBuilder_canBuildFormatter_730919527425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term68044 = new ArrayList();
        ((ArrayList) term68044).add((Object)null);
        ((ArrayList) term68044).add((Object)null);
        term67992 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term67992, term67992.getClass(), "iFormatter", null);
        setField(term67992, term67992.getClass(), "iElementPairs", term68044);
        ArrayList term68105 = new ArrayList();
        ((ArrayList) term68105).add((Object)null);
        ((ArrayList) term68105).add((Object)null);
        term68104 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term68107 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term68104, term68104.getClass(), "iElementPairs", term68105);
        setField(term68107, term68107.getClass(), "iPrinters", null);
        setField(term68107, term68107.getClass(), "iParsers", null);
        setIntField(term68107, term68107.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term68107, term68107.getClass(), "iParsedLengthEstimate", 0);
        setField(term68104, term68104.getClass(), "iFormatter", term68107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term67992, args);
        assertTrue(recursiveEquals(term67992, term68104));
    }

};


