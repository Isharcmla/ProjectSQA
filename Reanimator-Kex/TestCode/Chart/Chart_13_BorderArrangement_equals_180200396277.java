package org.jfree.chart.block;

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
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.block.EqualityUtils.*;

public class BorderArrangement_equals_180200396277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26801;
     Object term27779;
     Object term27780;

    public BorderArrangement_equals_180200396277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26801 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term27779 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term27779, term27779.getClass(), "centerBlock", null);
        setField(term27779, term27779.getClass(), "topBlock", null);
        setField(term27779, term27779.getClass(), "bottomBlock", null);
        setField(term27779, term27779.getClass(), "leftBlock", null);
        setField(term27779, term27779.getClass(), "rightBlock", null);
        term27780 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term27780, term27780.getClass(), "centerBlock", null);
        setField(term27780, term27780.getClass(), "topBlock", null);
        setField(term27780, term27780.getClass(), "bottomBlock", null);
        setField(term27780, term27780.getClass(), "leftBlock", null);
        setField(term27780, term27780.getClass(), "rightBlock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26801;
        Object retValue = callMethod(klass, "equals", argTypes, term26801, args);
        assertTrue(recursiveEquals(term26801, term27779));
        assertTrue(recursiveEquals(term26801, term27780));
        assertTrue(recursiveEquals(retValue, true));
    }

};


