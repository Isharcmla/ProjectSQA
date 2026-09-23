package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class Options_getOption_1809050762151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44247;
     Object term44611;

    public Options_getOption_1809050762151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term44113 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term44113, 0, term44113);
        HashMap term44295 = new HashMap();
        ((HashMap) term44295).put((Object)term44113, (Object)term44113);
        HashMap term44447 = new HashMap();
        ((HashMap) term44447).put((Object)null, (Object)null);
        term44247 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term44247, term44247.getClass(), "shortOpts", term44295);
        setField(term44247, term44247.getClass(), "longOpts", term44447);
        HashMap term44612 = new HashMap();
        HashMap term44617 = new HashMap();
        term44611 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term44611, term44611.getClass(), "shortOpts", term44612);
        setField(term44611, term44611.getClass(), "longOpts", term44617);
        setField(term44611, term44611.getClass(), "requiredOpts", null);
        setField(term44611, term44611.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getOption", argTypes, term44247, args);
        assertTrue(recursiveEquals(term44247, term44611));
        assertTrue(recursiveEquals(retValue, null));
    }

};


