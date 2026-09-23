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
import static org.apache.commons.math.stat.clustering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class KMeansPlusPlusClusterer_getFarthestPoint_85336608618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4462;
     Object term4514;

    public KMeansPlusPlusClusterer_getFarthestPoint_85336608618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4462 = newInstance(Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer"));
        term4514 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term4514;
        callMethod(klass, "getFarthestPoint", argTypes, term4462, args);
    }

};


