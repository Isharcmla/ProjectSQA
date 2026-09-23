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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_parse_105771338288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72189;
     Object term72437;
     Object term71922;

    public DefaultParser_parse_105771338288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72371 = new ArrayList();
        term72189 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term72255 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term72319 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term72189, term72189.getClass(), "options", term72255);
        setBooleanField(term72189, term72189.getClass(), "stopAtNonOption", false);
        setBooleanField(term72189, term72189.getClass(), "skipParsing", false);
        setField(term72189, term72189.getClass(), "currentOption", term72319);
        setField(term72189, term72189.getClass(), "expectedOpts", term72371);
        setField(term72189, term72189.getClass(), "cmd", null);
        setField(term72189, term72189.getClass(), "currentToken", null);
        LinkedHashMap term72579 = new LinkedHashMap();
        term72437 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term72519 = newInstance(Class.forName("java.util.Collections$UnmodifiableList"));
        setField(term72437, term72437.getClass(), "requiredOpts", term72519);
        setField(term72437, term72437.getClass(), "optionGroups", term72579);
        term71922 = (Object[]) newArray("java.lang.String", 1);
        setElement(term71922, 0, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term72437;
        args[1] = term71922;
        args[2] = true;
        try {
            callMethod(klass, "parse", argTypes, term72189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


