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

public class ListOrderedMap_entrySet_151253542247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5331;
     Object term11916;
     Object term11883;

    public ListOrderedMap_entrySet_151253542247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5334 = newInstance(Class.forName("java.lang.Object"));
        Object term5335 = newInstance(Class.forName("java.lang.Object"));
        Object term5336 = newInstance(Class.forName("java.lang.Object"));
        Object term5337 = newInstance(Class.forName("java.lang.Object"));
        Object term5338 = newInstance(Class.forName("java.lang.Object"));
        Object term5339 = newInstance(Class.forName("java.lang.Object"));
        Object term5340 = newInstance(Class.forName("java.lang.Object"));
        Object term5341 = newInstance(Class.forName("java.lang.Object"));
        Object term5342 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term5332 = new ArrayList();
        ((ArrayList) term5332).add(term5334);
        ((ArrayList) term5332).add(term5335);
        ((ArrayList) term5332).add(term5336);
        ((ArrayList) term5332).add(term5337);
        ((ArrayList) term5332).add(term5338);
        ((ArrayList) term5332).add(term5339);
        ((ArrayList) term5332).add(term5340);
        ((ArrayList) term5332).add(term5341);
        ((ArrayList) term5332).add(term5342);
        HashMap term5345 = new HashMap();
        term5331 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term5331, term5331.getClass(), "insertOrder", term5332);
        setField(term5331, term5331.getClass(), "map", term5345);
        Object term11919 = newInstance(Class.forName("java.lang.Object"));
        Object term11920 = newInstance(Class.forName("java.lang.Object"));
        Object term11921 = newInstance(Class.forName("java.lang.Object"));
        Object term11922 = newInstance(Class.forName("java.lang.Object"));
        Object term11923 = newInstance(Class.forName("java.lang.Object"));
        Object term11924 = newInstance(Class.forName("java.lang.Object"));
        Object term11925 = newInstance(Class.forName("java.lang.Object"));
        Object term11926 = newInstance(Class.forName("java.lang.Object"));
        Object term11927 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11917 = new ArrayList();
        ((ArrayList) term11917).add(term11919);
        ((ArrayList) term11917).add(term11920);
        ((ArrayList) term11917).add(term11921);
        ((ArrayList) term11917).add(term11922);
        ((ArrayList) term11917).add(term11923);
        ((ArrayList) term11917).add(term11924);
        ((ArrayList) term11917).add(term11925);
        ((ArrayList) term11917).add(term11926);
        ((ArrayList) term11917).add(term11927);
        HashMap term11928 = new HashMap();
        term11916 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11916, term11916.getClass(), "insertOrder", term11917);
        setField(term11916, term11916.getClass(), "map", term11928);
        Object term11887 = newInstance(Class.forName("java.lang.Object"));
        Object term11888 = newInstance(Class.forName("java.lang.Object"));
        Object term11889 = newInstance(Class.forName("java.lang.Object"));
        Object term11890 = newInstance(Class.forName("java.lang.Object"));
        Object term11891 = newInstance(Class.forName("java.lang.Object"));
        Object term11892 = newInstance(Class.forName("java.lang.Object"));
        Object term11893 = newInstance(Class.forName("java.lang.Object"));
        Object term11894 = newInstance(Class.forName("java.lang.Object"));
        Object term11895 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term11885 = new ArrayList();
        ((ArrayList) term11885).add(term11887);
        ((ArrayList) term11885).add(term11888);
        ((ArrayList) term11885).add(term11889);
        ((ArrayList) term11885).add(term11890);
        ((ArrayList) term11885).add(term11891);
        ((ArrayList) term11885).add(term11892);
        ((ArrayList) term11885).add(term11893);
        ((ArrayList) term11885).add(term11894);
        ((ArrayList) term11885).add(term11895);
        HashMap term11898 = new HashMap();
        term11883 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap$EntrySetView"));
        Object term11884 = newInstance(Class.forName("org.apache.commons.collections4.map.ListOrderedMap"));
        setField(term11884, term11884.getClass(), "insertOrder", term11885);
        setField(term11884, term11884.getClass(), "map", term11898);
        setField(term11883, term11883.getClass(), "parent", term11884);
        setField(term11883, term11883.getClass(), "insertOrder", term11885);
        setField(term11883, term11883.getClass(), "entrySet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.ListOrderedMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "entrySet", argTypes, term5331, args);
        assertTrue(recursiveEquals(term5331, term11916));
        assertTrue(recursiveEquals(retValue, term11883));
    }

};


