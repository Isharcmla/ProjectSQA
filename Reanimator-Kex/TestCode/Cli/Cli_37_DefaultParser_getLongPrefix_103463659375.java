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

public class DefaultParser_getLongPrefix_103463659375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48963;
     Object term54853;

    public DefaultParser_getLongPrefix_103463659375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term49089 = new LinkedHashMap();
        ((LinkedHashMap) term49089).put("", "");
        term48963 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term49029 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term49029, term49029.getClass(), "longOpts", term49089);
        setField(term48963, term48963.getClass(), "options", term49029);
        LinkedHashMap term54855 = new LinkedHashMap();
        term54853 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term54854 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term54853, term54853.getClass(), "cmd", null);
        setField(term54854, term54854.getClass(), "shortOpts", null);
        setField(term54854, term54854.getClass(), "longOpts", term54855);
        setField(term54854, term54854.getClass(), "requiredOpts", null);
        setField(term54854, term54854.getClass(), "optionGroups", null);
        setField(term54853, term54853.getClass(), "options", term54854);
        setBooleanField(term54853, term54853.getClass(), "stopAtNonOption", false);
        setField(term54853, term54853.getClass(), "currentToken", null);
        setField(term54853, term54853.getClass(), "currentOption", null);
        setBooleanField(term54853, term54853.getClass(), "skipParsing", false);
        setField(term54853, term54853.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term48963, args);
        assertTrue(recursiveEquals(term48963, term54853));
        assertTrue(recursiveEquals(retValue, null));
    }

};


