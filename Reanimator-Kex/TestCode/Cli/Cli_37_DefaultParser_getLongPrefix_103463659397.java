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
import java.lang.Object;
import java.util.LinkedHashMap;

public class DefaultParser_getLongPrefix_103463659397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359167;
     Object term366337;

    public DefaultParser_getLongPrefix_103463659397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term359293 = new LinkedHashMap();
        ((LinkedHashMap) term359293).put("", "");
        term359167 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term359233 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term359233, term359233.getClass(), "longOpts", term359293);
        setField(term359167, term359167.getClass(), "options", term359233);
        LinkedHashMap term366339 = new LinkedHashMap();
        term366337 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term366338 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term366337, term366337.getClass(), "cmd", null);
        setField(term366338, term366338.getClass(), "shortOpts", null);
        setField(term366338, term366338.getClass(), "longOpts", term366339);
        setField(term366338, term366338.getClass(), "requiredOpts", null);
        setField(term366338, term366338.getClass(), "optionGroups", null);
        setField(term366337, term366337.getClass(), "options", term366338);
        setBooleanField(term366337, term366337.getClass(), "stopAtNonOption", false);
        setField(term366337, term366337.getClass(), "currentToken", null);
        setField(term366337, term366337.getClass(), "currentOption", null);
        setBooleanField(term366337, term366337.getClass(), "skipParsing", false);
        setField(term366337, term366337.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                        ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term359167, args);
        assertTrue(recursiveEquals(term359167, term366337));
        assertTrue(recursiveEquals(retValue, null));
    }

};


