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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.lang.Object;

public class DefaultParser_parse_16712595078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336116;
     Object term336272;
     Object term335867;
     Object term353365;
     Object term353381;
     Object term353385;
     Object term353301;

    public DefaultParser_parse_16712595078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term336168 = new ArrayList();
        term336116 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term336116, term336116.getClass(), "options", null);
        setBooleanField(term336116, term336116.getClass(), "stopAtNonOption", false);
        setBooleanField(term336116, term336116.getClass(), "skipParsing", false);
        setField(term336116, term336116.getClass(), "currentOption", null);
        setField(term336116, term336116.getClass(), "expectedOpts", term336168);
        setField(term336116, term336116.getClass(), "cmd", null);
        setField(term336116, term336116.getClass(), "currentToken", "");
        LinkedList term336326 = new LinkedList();
        LinkedHashMap term336386 = new LinkedHashMap();
        term336272 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term336272, term336272.getClass(), "requiredOpts", term336326);
        setField(term336272, term336272.getClass(), "optionGroups", term336386);
        term335867 = (Object[]) newArray("java.lang.String", 2);
        setElement(term335867, 0, "");
        setElement(term335867, 1, "--");
        LinkedList term353367 = new LinkedList();
        ((LinkedList) term353367).add("");
        ArrayList term353371 = new ArrayList();
        LinkedList term353374 = new LinkedList();
        LinkedHashMap term353375 = new LinkedHashMap();
        ArrayList term353379 = new ArrayList();
        term353365 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term353366 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term353373 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term353366, term353366.getClass(), "args", term353367);
        setField(term353366, term353366.getClass(), "options", term353371);
        setField(term353365, term353365.getClass(), "cmd", term353366);
        setField(term353373, term353373.getClass(), "shortOpts", null);
        setField(term353373, term353373.getClass(), "longOpts", null);
        setField(term353373, term353373.getClass(), "requiredOpts", term353374);
        setField(term353373, term353373.getClass(), "optionGroups", term353375);
        setField(term353365, term353365.getClass(), "options", term353373);
        setBooleanField(term353365, term353365.getClass(), "stopAtNonOption", false);
        setField(term353365, term353365.getClass(), "currentToken", "--");
        setField(term353365, term353365.getClass(), "currentOption", null);
        setBooleanField(term353365, term353365.getClass(), "skipParsing", true);
        setField(term353365, term353365.getClass(), "expectedOpts", term353379);
        LinkedList term353382 = new LinkedList();
        LinkedHashMap term353383 = new LinkedHashMap();
        term353381 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term353381, term353381.getClass(), "shortOpts", null);
        setField(term353381, term353381.getClass(), "longOpts", null);
        setField(term353381, term353381.getClass(), "requiredOpts", term353382);
        setField(term353381, term353381.getClass(), "optionGroups", term353383);
        term353385 = (Object[]) newArray("java.lang.String", 2);
        setElement(term353385, 0, "");
        setElement(term353385, 1, "--");
        LinkedList term353302 = new LinkedList();
        ((LinkedList) term353302).add("");
        ArrayList term353308 = new ArrayList();
        term353301 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term353301, term353301.getClass(), "args", term353302);
        setField(term353301, term353301.getClass(), "options", term353308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term336272;
        args[1] = term335867;
        Object retValue = callMethod(klass, "parse", argTypes, term336116, args);
        assertTrue(recursiveEquals(term336116, term353365));
        assertTrue(recursiveEquals(term336272, term353381));
        assertTrue(recursiveEquals(term335867, term353385));
        assertTrue(recursiveEquals(retValue, term353301));
    }

};


