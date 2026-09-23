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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Parser_parse_178972289516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266;
     Object term286;
     Object term335;

    public Parser_parse_178972289516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term267 = new HashMap();
        HashMap term272 = new HashMap();
        ArrayList term277 = new ArrayList();
        HashMap term281 = new HashMap();
        term266 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term266, term266.getClass(), "shortOpts", term267);
        setField(term266, term266.getClass(), "longOpts", term272);
        setField(term266, term266.getClass(), "requiredOpts", term277);
        setField(term266, term266.getClass(), "optionGroups", term281);
        term286 = (Object[]) newArray("java.lang.String", 4);
        setElement(term286, 0, "RMFIsYGgne");
        setElement(term286, 1, "NRdvgJlhkX");
        setElement(term286, 2, "uuaPigETmJ");
        setElement(term286, 3, "MxlszYVzRf");
        term335 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term266;
        args[1] = term286;
        args[2] = term335;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


