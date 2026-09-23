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
import java.util.LinkedList;
import java.lang.Object;

public class PeriodFormatterBuilder_createComposite_98856221789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;
     Object term5369;
     Object term5362;

    public PeriodFormatterBuilder_createComposite_98856221789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1020 = new LinkedList();
        term5369 = new LinkedList();
        term5362 = (Object[]) newArray("java.lang.Object", 2);
        Object term5363 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$Literal"));
        setField(term5363, term5363.getClass(), "iText", "");
        setElement(term5362, 0, term5363);
        setElement(term5362, 1, term5363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1020;
        Object retValue = callMethod(klass, "createComposite", argTypes, null, args);
        assertTrue(recursiveEquals(term1020, term5369));
        assertTrue(recursiveEquals(retValue, term5362));
    }

};


