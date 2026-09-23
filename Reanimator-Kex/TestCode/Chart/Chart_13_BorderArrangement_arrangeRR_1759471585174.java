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

public class BorderArrangement_arrangeRR_1759471585174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63524;
     Object term63570;
     Object term63616;
     Object term64200;
     Object term64201;
     Object term64202;
     Object term64194;

    public BorderArrangement_arrangeRR_1759471585174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63524 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term63524, term63524.getClass(), "topBlock", null);
        setField(term63524, term63524.getClass(), "bottomBlock", null);
        setField(term63524, term63524.getClass(), "leftBlock", null);
        term63570 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term63570, term63570.getClass(), "lower", 7.6775229065527296E16);
        setDoubleField(term63570, term63570.getClass(), "upper", 6.9896671096345723E18);
        term63616 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term63616, term63616.getClass(), "lower", 2.3103937721456394E18);
        setDoubleField(term63616, term63616.getClass(), "upper", 9.2143898965869855E18);
        term64200 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term64200, term64200.getClass(), "centerBlock", null);
        setField(term64200, term64200.getClass(), "topBlock", null);
        setField(term64200, term64200.getClass(), "bottomBlock", null);
        setField(term64200, term64200.getClass(), "leftBlock", null);
        setField(term64200, term64200.getClass(), "rightBlock", null);
        term64201 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term64201, term64201.getClass(), "lower", 2.3103937721456394E18);
        setDoubleField(term64201, term64201.getClass(), "upper", 9.2143898965869855E18);
        term64202 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term64202, term64202.getClass(), "lower", 7.6775229065527296E16);
        setDoubleField(term64202, term64202.getClass(), "upper", 6.9896671096345723E18);
        term64194 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term64194, term64194.getClass(), "width", 0.0);
        setDoubleField(term64194, term64194.getClass(), "height", 0.0);
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
        args[1] = term63570;
        args[2] = term63616;
        args[3] = null;
        Object retValue = callMethod(klass, "arrangeRR", argTypes, term63524, args);
        assertTrue(recursiveEquals(term63524, term64200));
        assertTrue(recursiveEquals(term63570, term64202));
        assertTrue(recursiveEquals(term63616, null));
        assertTrue(recursiveEquals(retValue, term64194));
    }

};


