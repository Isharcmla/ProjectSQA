package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_toArray_156448619978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12417;

    public XYSeries_toArray_156448619978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12507 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term12469 = new ArrayList();
        ((ArrayList) term12469).add(term12507);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        ((ArrayList) term12469).add((Object)null);
        term12417 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setField(term12417, term12417.getClass(), "data", term12469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toArray", argTypes, term12417, args);
    }

};


