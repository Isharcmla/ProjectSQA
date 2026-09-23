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

public class BorderArrangement_arrangeRR_1759471585304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114760;
     Object term114806;
     Object term114852;
     Object term114953;
     Object term114954;
     Object term114955;
     Object term114947;

    public BorderArrangement_arrangeRR_1759471585304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114760 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term114760, term114760.getClass(), "topBlock", null);
        setField(term114760, term114760.getClass(), "bottomBlock", null);
        setField(term114760, term114760.getClass(), "leftBlock", null);
        term114806 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term114806, term114806.getClass(), "lower", -9.2188684372274053E18);
        setDoubleField(term114806, term114806.getClass(), "upper", -9.2166166374137201E18);
        term114852 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term114852, term114852.getClass(), "lower", 4.503599627370497E15);
        setDoubleField(term114852, term114852.getClass(), "upper", 4.611690416473899E18);
        term114953 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term114953, term114953.getClass(), "centerBlock", null);
        setField(term114953, term114953.getClass(), "topBlock", null);
        setField(term114953, term114953.getClass(), "bottomBlock", null);
        setField(term114953, term114953.getClass(), "leftBlock", null);
        setField(term114953, term114953.getClass(), "rightBlock", null);
        term114954 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term114954, term114954.getClass(), "lower", 4.503599627370497E15);
        setDoubleField(term114954, term114954.getClass(), "upper", 4.611690416473899E18);
        term114955 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term114955, term114955.getClass(), "lower", -9.2188684372274053E18);
        setDoubleField(term114955, term114955.getClass(), "upper", -9.2166166374137201E18);
        term114947 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term114947, term114947.getClass(), "width", 0.0);
        setDoubleField(term114947, term114947.getClass(), "height", 0.0);
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
        args[1] = term114806;
        args[2] = term114852;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term114760, args);
        assertTrue(recursiveEquals(term114760, term114953));
        assertTrue(recursiveEquals(term114806, term114955));
        assertTrue(recursiveEquals(term114852, null));
        assertTrue(recursiveEquals(retValue, term114947));
    }

};


