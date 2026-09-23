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

public class DefaultParser_getLongPrefix_103463659386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70101;
     Object term351251;

    public DefaultParser_getLongPrefix_103463659386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term70227 = new LinkedHashMap();
        ((LinkedHashMap) term70227).put("", "");
        term70101 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term70167 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term70167, term70167.getClass(), "longOpts", term70227);
        setField(term70101, term70101.getClass(), "options", term70167);
        LinkedHashMap term351253 = new LinkedHashMap();
        term351251 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term351252 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term351251, term351251.getClass(), "cmd", null);
        setField(term351252, term351252.getClass(), "shortOpts", null);
        setField(term351252, term351252.getClass(), "longOpts", term351253);
        setField(term351252, term351252.getClass(), "requiredOpts", null);
        setField(term351252, term351252.getClass(), "optionGroups", null);
        setField(term351251, term351251.getClass(), "options", term351252);
        setBooleanField(term351251, term351251.getClass(), "stopAtNonOption", false);
        setField(term351251, term351251.getClass(), "currentToken", null);
        setField(term351251, term351251.getClass(), "currentOption", null);
        setBooleanField(term351251, term351251.getClass(), "skipParsing", false);
        setField(term351251, term351251.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term70101, args);
        assertTrue(recursiveEquals(term70101, term351251));
        assertTrue(recursiveEquals(retValue, null));
    }

};


