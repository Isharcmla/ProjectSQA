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
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_toParser_585569977243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185907;

    public PeriodFormatterBuilder_toParser_585569977243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term186011 = new ArrayList();
        ArrayList term186063 = new ArrayList();
        Object term186173 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        ArrayList term186225 = new ArrayList();
        ArrayList term186277 = new ArrayList();
        Object term186389 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        Object term186501 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        Object term186539 = newInstance(Class.forName("java.lang.Object"));
        Object term186577 = newInstance(Class.forName("java.lang.Object"));
        Object term186689 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Composite"));
        ArrayList term186741 = new ArrayList();
        ArrayList term186793 = new ArrayList();
        ArrayList term186845 = new ArrayList();
        Object[] term185552 = (Object[]) newArray("java.lang.Object", 0);
        ArrayList term186897 = new ArrayList();
        Object term187007 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term187119 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Separator"));
        ArrayList term185959 = new ArrayList();
        ((ArrayList) term185959).add(term186011);
        ((ArrayList) term185959).add(term186063);
        ((ArrayList) term185959).add(term186173);
        ((ArrayList) term185959).add(term186225);
        ((ArrayList) term185959).add(term186277);
        ((ArrayList) term185959).add(term186063);
        ((ArrayList) term185959).add(term186389);
        ((ArrayList) term185959).add(term186063);
        ((ArrayList) term185959).add(term186063);
        ((ArrayList) term185959).add((Object)null);
        ((ArrayList) term185959).add(term186501);
        ((ArrayList) term185959).add(term186539);
        ((ArrayList) term185959).add(term186577);
        ((ArrayList) term185959).add(term186063);
        ((ArrayList) term185959).add(term186225);
        ((ArrayList) term185959).add(term186689);
        ((ArrayList) term185959).add(term186741);
        ((ArrayList) term185959).add((Object)null);
        ((ArrayList) term185959).add(term186793);
        ((ArrayList) term185959).add(term186845);
        ((ArrayList) term185959).add((Object)term185552);
        ((ArrayList) term185959).add(term186897);
        ((ArrayList) term185959).add(term187007);
        ((ArrayList) term185959).add(term187119);
        term185907 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setBooleanField(term185907, term185907.getClass(), "iNotParser", false);
        setField(term185907, term185907.getClass(), "iElementPairs", term185959);
        setBooleanField(term185907, term185907.getClass(), "iNotPrinter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toParser", argTypes, term185907, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


