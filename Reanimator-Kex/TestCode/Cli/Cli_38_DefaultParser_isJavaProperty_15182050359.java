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

public class DefaultParser_isJavaProperty_15182050359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25055;
     Object term26723;

    public DefaultParser_isJavaProperty_15182050359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term25181 = new LinkedHashMap();
        LinkedHashMap term25345 = new LinkedHashMap();
        ((LinkedHashMap) term25345).put("", "");
        term25055 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term25121 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term25121, term25121.getClass(), "shortOpts", term25181);
        setField(term25121, term25121.getClass(), "longOpts", term25345);
        setField(term25055, term25055.getClass(), "options", term25121);
        LinkedHashMap term26725 = new LinkedHashMap();
        LinkedHashMap term26726 = new LinkedHashMap();
        term26723 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term26724 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term26723, term26723.getClass(), "cmd", null);
        setField(term26724, term26724.getClass(), "shortOpts", term26725);
        setField(term26724, term26724.getClass(), "longOpts", term26726);
        setField(term26724, term26724.getClass(), "requiredOpts", null);
        setField(term26724, term26724.getClass(), "optionGroups", null);
        setField(term26723, term26723.getClass(), "options", term26724);
        setBooleanField(term26723, term26723.getClass(), "stopAtNonOption", false);
        setField(term26723, term26723.getClass(), "currentToken", null);
        setField(term26723, term26723.getClass(), "currentOption", null);
        setBooleanField(term26723, term26723.getClass(), "skipParsing", false);
        setField(term26723, term26723.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "\u0010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ";
        Object retValue = callMethod(klass, "isJavaProperty", argTypes, term25055, args);
        assertTrue(recursiveEquals(term25055, term26723));
        assertTrue(recursiveEquals(retValue, false));
    }

};


