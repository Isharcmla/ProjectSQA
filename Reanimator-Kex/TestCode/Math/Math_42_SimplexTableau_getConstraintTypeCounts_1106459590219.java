package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class SimplexTableau_getConstraintTypeCounts_1106459590219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130876;
     Object enum145;

    public SimplexTableau_getConstraintTypeCounts_1106459590219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131290 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term131289 = ((Class) term131290).getDeclaredField((String) "GEQ");
        ((Field) term131289).setAccessible(true);
        enum145 = ((Field) term131289).get((Object) null);
        Object term131054 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term131054, term131054.getClass(), "relationship", enum145);
        ArrayList term130928 = new ArrayList();
        ((ArrayList) term130928).add(term131054);
        term130876 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term130876, term130876.getClass(), "constraints", term130928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.Relationship");
        Object[] args = new Object[1];
        args[0] = enum145;
        callMethod(klass, "getConstraintTypeCounts", argTypes, term130876, args);
    }

};


