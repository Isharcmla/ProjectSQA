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
import java.util.LinkedHashMap;
import java.lang.Object;

public class Options_hasOption_33069333737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5196;
     Object term5443;

    public Options_hasOption_33069333737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5256 = new LinkedHashMap();
        ((LinkedHashMap) term5256).put("", "");
        ((LinkedHashMap) term5256).put((Object)null, (Object)null);
        ((LinkedHashMap) term5256).put((Object)null, (Object)null);
        ((LinkedHashMap) term5256).put((Object)null, (Object)null);
        term5196 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5196, term5196.getClass(), "shortOpts", term5256);
        LinkedHashMap term5444 = new LinkedHashMap();
        term5443 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5443, term5443.getClass(), "shortOpts", term5444);
        setField(term5443, term5443.getClass(), "longOpts", null);
        setField(term5443, term5443.getClass(), "requiredOpts", null);
        setField(term5443, term5443.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "hasOption", argTypes, term5196, args);
        assertTrue(recursiveEquals(term5196, term5443));
        assertTrue(recursiveEquals(retValue, true));
    }

};


