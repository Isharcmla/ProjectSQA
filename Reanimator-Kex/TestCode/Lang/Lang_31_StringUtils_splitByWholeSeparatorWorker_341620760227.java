package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;

public class StringUtils_splitByWholeSeparatorWorker_341620760227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2582;
     Object term2584;
     Object term12028;

    public StringUtils_splitByWholeSeparatorWorker_341620760227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2582 = new Integer(1048535127);
        term2584 = new Boolean(false);
        term12028 = (Object[]) newArray("java.lang.String", 1);
        setElement(term12028, 0, "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "OEXDRUKcFl";
        args[1] = "RYdKCNNMBR";
        args[2] = term2582;
        args[3] = term2584;
        Object retValue = callMethod(klass, "splitByWholeSeparatorWorker", argTypes, null, args);
        assertTrue(recursiveEquals(term2582, 1048535127));
        assertTrue(recursiveEquals(term2584, false));
        assertTrue(recursiveEquals(retValue, term12028));
    }

};


