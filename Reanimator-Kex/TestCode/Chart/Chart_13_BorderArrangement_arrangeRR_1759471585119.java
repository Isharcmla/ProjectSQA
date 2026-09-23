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

public class BorderArrangement_arrangeRR_1759471585119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43673;
     Object term43719;
     Object term43765;
     Object term43866;
     Object term43867;
     Object term43868;
     Object term43860;

    public BorderArrangement_arrangeRR_1759471585119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43673 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term43673, term43673.getClass(), "topBlock", null);
        setField(term43673, term43673.getClass(), "bottomBlock", null);
        setField(term43673, term43673.getClass(), "leftBlock", null);
        term43719 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term43719, term43719.getClass(), "lower", -9.2166166374137201E18);
        term43765 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term43765, term43765.getClass(), "lower", 8.2505945173427487E18);
        setDoubleField(term43765, term43765.getClass(), "upper", 8.3046377128732918E18);
        term43866 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term43866, term43866.getClass(), "centerBlock", null);
        setField(term43866, term43866.getClass(), "topBlock", null);
        setField(term43866, term43866.getClass(), "bottomBlock", null);
        setField(term43866, term43866.getClass(), "leftBlock", null);
        setField(term43866, term43866.getClass(), "rightBlock", null);
        term43867 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term43867, term43867.getClass(), "lower", 8.2505945173427487E18);
        setDoubleField(term43867, term43867.getClass(), "upper", 8.3046377128732918E18);
        term43868 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term43868, term43868.getClass(), "lower", -9.2166166374137201E18);
        setDoubleField(term43868, term43868.getClass(), "upper", 0.0);
        term43860 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term43860, term43860.getClass(), "width", 0.0);
        setDoubleField(term43860, term43860.getClass(), "height", 0.0);
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
        args[1] = term43719;
        args[2] = term43765;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term43673, args);
        assertTrue(recursiveEquals(term43673, term43866));
        assertTrue(recursiveEquals(term43719, term43868));
        assertTrue(recursiveEquals(term43765, null));
        assertTrue(recursiveEquals(retValue, term43860));
    }

};


