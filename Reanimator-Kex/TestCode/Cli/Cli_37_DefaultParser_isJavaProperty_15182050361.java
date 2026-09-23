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

public class DefaultParser_isJavaProperty_15182050361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23108;
     Object term24776;

    public DefaultParser_isJavaProperty_15182050361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term23234 = new LinkedHashMap();
        LinkedHashMap term23398 = new LinkedHashMap();
        ((LinkedHashMap) term23398).put("", "");
        term23108 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term23174 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term23174, term23174.getClass(), "shortOpts", term23234);
        setField(term23174, term23174.getClass(), "longOpts", term23398);
        setField(term23108, term23108.getClass(), "options", term23174);
        LinkedHashMap term24778 = new LinkedHashMap();
        LinkedHashMap term24779 = new LinkedHashMap();
        term24776 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term24777 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term24776, term24776.getClass(), "cmd", null);
        setField(term24777, term24777.getClass(), "shortOpts", term24778);
        setField(term24777, term24777.getClass(), "longOpts", term24779);
        setField(term24777, term24777.getClass(), "requiredOpts", null);
        setField(term24777, term24777.getClass(), "optionGroups", null);
        setField(term24776, term24776.getClass(), "options", term24777);
        setBooleanField(term24776, term24776.getClass(), "stopAtNonOption", false);
        setField(term24776, term24776.getClass(), "currentToken", null);
        setField(term24776, term24776.getClass(), "currentOption", null);
        setBooleanField(term24776, term24776.getClass(), "skipParsing", false);
        setField(term24776, term24776.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        Object retValue = callMethod(klass, "isJavaProperty", argTypes, term23108, args);
        assertTrue(recursiveEquals(term23108, term24776));
        assertTrue(recursiveEquals(retValue, false));
    }

};


