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

public class DefaultParser_getLongPrefix_103463659373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49592;
     Object term334769;

    public DefaultParser_getLongPrefix_103463659373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term49718 = new LinkedHashMap();
        ((LinkedHashMap) term49718).put("", "");
        term49592 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term49658 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term49658, term49658.getClass(), "longOpts", term49718);
        setField(term49592, term49592.getClass(), "options", term49658);
        LinkedHashMap term334771 = new LinkedHashMap();
        term334769 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term334770 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term334769, term334769.getClass(), "cmd", null);
        setField(term334770, term334770.getClass(), "shortOpts", null);
        setField(term334770, term334770.getClass(), "longOpts", term334771);
        setField(term334770, term334770.getClass(), "requiredOpts", null);
        setField(term334770, term334770.getClass(), "optionGroups", null);
        setField(term334769, term334769.getClass(), "options", term334770);
        setBooleanField(term334769, term334769.getClass(), "stopAtNonOption", false);
        setField(term334769, term334769.getClass(), "currentToken", null);
        setField(term334769, term334769.getClass(), "currentOption", null);
        setBooleanField(term334769, term334769.getClass(), "skipParsing", false);
        setField(term334769, term334769.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term49592, args);
        assertTrue(recursiveEquals(term49592, term334769));
        assertTrue(recursiveEquals(retValue, null));
    }

};


