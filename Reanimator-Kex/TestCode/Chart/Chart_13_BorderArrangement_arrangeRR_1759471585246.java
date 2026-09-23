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

public class BorderArrangement_arrangeRR_1759471585246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91096;
     Object term91142;
     Object term91188;
     Object term91289;
     Object term91290;
     Object term91291;
     Object term91283;

    public BorderArrangement_arrangeRR_1759471585246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91096 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term91096, term91096.getClass(), "topBlock", null);
        setField(term91096, term91096.getClass(), "bottomBlock", null);
        setField(term91096, term91096.getClass(), "leftBlock", null);
        term91142 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term91142, term91142.getClass(), "lower", 0.0);
        term91188 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term91188, term91188.getClass(), "lower", 7.4309398433046784E16);
        setDoubleField(term91188, term91188.getClass(), "upper", 7.656126361066304E16);
        term91289 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term91289, term91289.getClass(), "centerBlock", null);
        setField(term91289, term91289.getClass(), "topBlock", null);
        setField(term91289, term91289.getClass(), "bottomBlock", null);
        setField(term91289, term91289.getClass(), "leftBlock", null);
        setField(term91289, term91289.getClass(), "rightBlock", null);
        term91290 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term91290, term91290.getClass(), "lower", 7.4309398433046784E16);
        setDoubleField(term91290, term91290.getClass(), "upper", 7.656126361066304E16);
        term91291 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term91291, term91291.getClass(), "lower", 0.0);
        setDoubleField(term91291, term91291.getClass(), "upper", 0.0);
        term91283 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term91283, term91283.getClass(), "width", 0.0);
        setDoubleField(term91283, term91283.getClass(), "height", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("org.jfree.data.Range");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term91142;
        args[2] = term91188;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term91096, args);
        assertTrue(recursiveEquals(term91096, term91289));
        assertTrue(recursiveEquals(term91142, term91291));
        assertTrue(recursiveEquals(term91188, null));
        assertTrue(recursiveEquals(retValue, term91283));
    }

};


