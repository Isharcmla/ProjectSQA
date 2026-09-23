package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class SingularValueDecompositionImpl_getVT_91805574173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32679;
     Object term32787;
     Object term32779;

    public SingularValueDecompositionImpl_getVT_91805574173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32679 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term32777 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term32679, term32679.getClass(), "cachedVt", term32777);
        term32787 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term32788 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term32787, term32787.getClass(), "m", 0);
        setIntField(term32787, term32787.getClass(), "n", 0);
        setField(term32787, term32787.getClass(), "transformer", null);
        setField(term32787, term32787.getClass(), "mainBidiagonal", null);
        setField(term32787, term32787.getClass(), "secondaryBidiagonal", null);
        setField(term32787, term32787.getClass(), "mainTridiagonal", null);
        setField(term32787, term32787.getClass(), "secondaryTridiagonal", null);
        setField(term32787, term32787.getClass(), "eigenDecomposition", null);
        setField(term32787, term32787.getClass(), "singularValues", null);
        setField(term32787, term32787.getClass(), "cachedU", null);
        setField(term32787, term32787.getClass(), "cachedUt", null);
        setField(term32787, term32787.getClass(), "cachedS", null);
        setField(term32787, term32787.getClass(), "cachedV", null);
        setField(term32788, term32788.getClass(), "blocks", null);
        setIntField(term32788, term32788.getClass(), "rows", 0);
        setIntField(term32788, term32788.getClass(), "columns", 0);
        setIntField(term32788, term32788.getClass(), "blockRows", 0);
        setIntField(term32788, term32788.getClass(), "blockColumns", 0);
        setField(term32788, term32788.getClass(), "lu", null);
        setField(term32787, term32787.getClass(), "cachedVt", term32788);
        term32779 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term32779, term32779.getClass(), "blocks", null);
        setIntField(term32779, term32779.getClass(), "rows", 0);
        setIntField(term32779, term32779.getClass(), "columns", 0);
        setIntField(term32779, term32779.getClass(), "blockRows", 0);
        setIntField(term32779, term32779.getClass(), "blockColumns", 0);
        setField(term32779, term32779.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getVT", argTypes, term32679, args);
        assertTrue(recursiveEquals(term32679, term32787));
        assertTrue(recursiveEquals(retValue, term32779));
    }

};


