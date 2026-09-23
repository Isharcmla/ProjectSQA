package org.apache.commons.math.stat.clustering;

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
import static org.apache.commons.math.stat.clustering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class KMeansPlusPlusClusterer_chooseInitialCenters_71776635713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;
     Object term585;

    public KMeansPlusPlusClusterer_chooseInitialCenters_71776635713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584 = newInstance(Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer"));
        setField(term584, term584.getClass(), "random", null);
        setField(term584, term584.getClass(), "emptyStrategy", null);
        term585 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Random");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term585;
        args[2] = null;
        try {
            callMethod(klass, "chooseInitialCenters", argTypes, term584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


