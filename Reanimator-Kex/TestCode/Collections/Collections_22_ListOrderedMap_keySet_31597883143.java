package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ListOrderedMap_keySet_31597883143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5237;
     Object term11798;
     Object term11779;

    public ListOrderedMap_keySet_31597883143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5240 = newInstance(Class.forName("java.lang.Object"));
        Object term5241 = newInstance(Class.forName("java.lang.Object"));
        Object term5242 = newInstance(Class.forName("java.lang.Object"));
        Object term5243 = newInstance(Class.forName("java.lang.Object"));
        Object term5244 = newInstance(Class.forName("java.lang.Object"));
        Object term5245 = newInstance(Class.forName("java.lang.Object"));
        Object term5246 = newInstance(Class.forName("java.lang.Object"));
        Object term5247 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5238 = new ArrayList();
        ((ArrayList) term5238).add(term5240);
        ((ArrayList) term5238).add(term5241);
        ((ArrayList) term5238).add(term5242);
        ((ArrayList) term5238).add(term5243);
        ((ArrayList) term5238).add(term5244);
        ((ArrayList) term5238).add(term5245);
        ((ArrayList) term5238).add(term5246);
        ((ArrayList) term5238).add(term5247);
        HashMap term5250 = new HashMap();
        term5237 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5237, term5237.getClass(), "insertOrder", term5238);
        setField(term5237, term5237.getClass(), "map", term5250);
        Object term11801 = newInstance(Class.forName("java.lang.Object"));
        Object term11802 = newInstance(Class.forName("java.lang.Object"));
        Object term11803 = newInstance(Class.forName("java.lang.Object"));
        Object term11804 = newInstance(Class.forName("java.lang.Object"));
        Object term11805 = newInstance(Class.forName("java.lang.Object"));
        Object term11806 = newInstance(Class.forName("java.lang.Object"));
        Object term11807 = newInstance(Class.forName("java.lang.Object"));
        Object term11808 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11799 = new ArrayList();
        ((ArrayList) term11799).add(term11801);
        ((ArrayList) term11799).add(term11802);
        ((ArrayList) term11799).add(term11803);
        ((ArrayList) term11799).add(term11804);
        ((ArrayList) term11799).add(term11805);
        ((ArrayList) term11799).add(term11806);
        ((ArrayList) term11799).add(term11807);
        ((ArrayList) term11799).add(term11808);
        HashMap term11809 = new HashMap();
        term11798 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11798, term11798.getClass(), "insertOrder", term11799);
        setField(term11798, term11798.getClass(), "map", term11809);
        Object term11783 = newInstance(Class.forName("java.lang.Object"));
        Object term11784 = newInstance(Class.forName("java.lang.Object"));
        Object term11785 = newInstance(Class.forName("java.lang.Object"));
        Object term11786 = newInstance(Class.forName("java.lang.Object"));
        Object term11787 = newInstance(Class.forName("java.lang.Object"));
        Object term11788 = newInstance(Class.forName("java.lang.Object"));
        Object term11789 = newInstance(Class.forName("java.lang.Object"));
        Object term11790 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11781 = new ArrayList();
        ((ArrayList) term11781).add(term11783);
        ((ArrayList) term11781).add(term11784);
        ((ArrayList) term11781).add(term11785);
        ((ArrayList) term11781).add(term11786);
        ((ArrayList) term11781).add(term11787);
        ((ArrayList) term11781).add(term11788);
        ((ArrayList) term11781).add(term11789);
        ((ArrayList) term11781).add(term11790);
        HashMap term11793 = new HashMap();
        term11779 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap$KeySetView"));
        Object term11780 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11780, term11780.getClass(), "insertOrder", term11781);
        setField(term11780, term11780.getClass(), "map", term11793);
        setField(term11779, term11779.getClass(), "parent", term11780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keySet", argTypes, term5237, args);
        assertTrue(recursiveEquals(term5237, term11798));
        assertTrue(recursiveEquals(retValue, term11779));
    }

};


