package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnionContext_setPosition_60572528567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14844;

    public UnionContext_setPosition_60572528567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term14926 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term14712 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term15028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term14844, term14844.getClass(), "prepared", false);
        setField(term14844, term14844.getClass(), "nodeSet", term14926);
        setElement(term14712, 0, term15028);
        setField(term14844, term14844.getClass(), "contexts", term14712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term14844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


