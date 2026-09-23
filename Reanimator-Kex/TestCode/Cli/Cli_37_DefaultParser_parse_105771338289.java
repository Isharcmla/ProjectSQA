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
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class DefaultParser_parse_105771338289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72857;
     Object term72997;
     Object term72620;
     Object term352390;
     Object term352403;
     Object term352407;
     Object term352350;

    public DefaultParser_parse_105771338289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72857 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term72931 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term72857, term72857.getClass(), "options", null);
        setBooleanField(term72857, term72857.getClass(), "stopAtNonOption", false);
        setBooleanField(term72857, term72857.getClass(), "skipParsing", false);
        setField(term72857, term72857.getClass(), "currentOption", null);
        setField(term72857, term72857.getClass(), "expectedOpts", null);
        setField(term72857, term72857.getClass(), "cmd", term72931);
        setField(term72857, term72857.getClass(), "currentToken", null);
        LinkedList term73043 = new LinkedList();
        LinkedHashMap term73103 = new LinkedHashMap();
        term72997 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term72997, term72997.getClass(), "requiredOpts", term73043);
        setField(term72997, term72997.getClass(), "optionGroups", term73103);
        term72620 = (Object[]) newArray("java.lang.String", 1);
        setElement(term72620, 0, "--");
        LinkedList term352392 = new LinkedList();
        ArrayList term352393 = new ArrayList();
        LinkedList term352396 = new LinkedList();
        LinkedHashMap term352397 = new LinkedHashMap();
        ArrayList term352401 = new ArrayList();
        term352390 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term352391 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term352395 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term352391, term352391.getClass(), "args", term352392);
        setField(term352391, term352391.getClass(), "options", term352393);
        setField(term352390, term352390.getClass(), "cmd", term352391);
        setField(term352395, term352395.getClass(), "shortOpts", null);
        setField(term352395, term352395.getClass(), "longOpts", null);
        setField(term352395, term352395.getClass(), "requiredOpts", term352396);
        setField(term352395, term352395.getClass(), "optionGroups", term352397);
        setField(term352390, term352390.getClass(), "options", term352395);
        setBooleanField(term352390, term352390.getClass(), "stopAtNonOption", true);
        setField(term352390, term352390.getClass(), "currentToken", "--");
        setField(term352390, term352390.getClass(), "currentOption", null);
        setBooleanField(term352390, term352390.getClass(), "skipParsing", true);
        setField(term352390, term352390.getClass(), "expectedOpts", term352401);
        LinkedList term352404 = new LinkedList();
        LinkedHashMap term352405 = new LinkedHashMap();
        term352403 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term352403, term352403.getClass(), "shortOpts", null);
        setField(term352403, term352403.getClass(), "longOpts", null);
        setField(term352403, term352403.getClass(), "requiredOpts", term352404);
        setField(term352403, term352403.getClass(), "optionGroups", term352405);
        term352407 = (Object[]) newArray("java.lang.String", 1);
        setElement(term352407, 0, "--");
        LinkedList term352351 = new LinkedList();
        ArrayList term352354 = new ArrayList();
        term352350 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term352350, term352350.getClass(), "args", term352351);
        setField(term352350, term352350.getClass(), "options", term352354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term72997;
        args[1] = term72620;
        args[2] = true;
        Object retValue = callMethod(klass, "parse", argTypes, term72857, args);
        assertTrue(recursiveEquals(term72857, term352390));
        assertTrue(recursiveEquals(term72997, term352403));
        assertTrue(recursiveEquals(term72620, term352407));
        assertTrue(recursiveEquals(retValue, term352350));
    }

};


