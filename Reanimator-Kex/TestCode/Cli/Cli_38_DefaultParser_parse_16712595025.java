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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_parse_16712595025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term113;
     Object term136;
     Object term5366;
     Object term5388;
     Object term5395;
     Object term5144;

    public DefaultParser_parse_16712595025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3 = new LinkedList();
        ArrayList term6 = new ArrayList();
        LinkedHashMap term11 = new LinkedHashMap();
        LinkedHashMap term17 = new LinkedHashMap();
        ArrayList term23 = new ArrayList();
        LinkedHashMap term27 = new LinkedHashMap();
        ArrayList term98 = new ArrayList();
        ((ArrayList) term98).add("");
        ((ArrayList) term98).add("");
        ((ArrayList) term98).add("");
        ((ArrayList) term98).add("");
        ((ArrayList) term98).add("");
        ArrayList term109 = new ArrayList();
        term1 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term46 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2, term2.getClass(), "args", term3);
        setField(term2, term2.getClass(), "options", term6);
        setField(term1, term1.getClass(), "cmd", term2);
        setField(term10, term10.getClass(), "shortOpts", term11);
        setField(term10, term10.getClass(), "longOpts", term17);
        setField(term10, term10.getClass(), "requiredOpts", term23);
        setField(term10, term10.getClass(), "optionGroups", term27);
        setField(term1, term1.getClass(), "options", term10);
        setBooleanField(term1, term1.getClass(), "stopAtNonOption", false);
        setField(term1, term1.getClass(), "currentToken", "PAEBtnZtTD");
        setField(term46, term46.getClass(), "opt", "sjlJAEtRrb");
        setField(term46, term46.getClass(), "longOpt", "MuLcgQHgqz");
        setField(term46, term46.getClass(), "argName", "xxtlPwDYFs");
        setField(term46, term46.getClass(), "description", "jJCZpVmanW");
        setBooleanField(term46, term46.getClass(), "required", false);
        setBooleanField(term46, term46.getClass(), "optionalArg", false);
        setIntField(term46, term46.getClass(), "numberOfArgs", 568599855);
        setField(term46, term46.getClass(), "type", null);
        setField(term46, term46.getClass(), "values", term98);
        setCharField(term46, term46.getClass(), "valuesep", 'P');
        setField(term1, term1.getClass(), "currentOption", term46);
        setBooleanField(term1, term1.getClass(), "skipParsing", false);
        setField(term1, term1.getClass(), "expectedOpts", term109);
        LinkedHashMap term114 = new LinkedHashMap();
        LinkedHashMap term120 = new LinkedHashMap();
        ArrayList term126 = new ArrayList();
        LinkedHashMap term130 = new LinkedHashMap();
        term113 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term113, term113.getClass(), "shortOpts", term114);
        setField(term113, term113.getClass(), "longOpts", term120);
        setField(term113, term113.getClass(), "requiredOpts", term126);
        setField(term113, term113.getClass(), "optionGroups", term130);
        term136 = (Object[]) newArray("java.lang.String", 3);
        setElement(term136, 0, "NRdvgJlhkX");
        setElement(term136, 1, "uuaPigETmJ");
        setElement(term136, 2, "MxlszYVzRf");
        LinkedList term5368 = new LinkedList();
        ((LinkedList) term5368).add("NRdvgJlhkX");
        ((LinkedList) term5368).add("");
        ((LinkedList) term5368).add((Object)null);
        ArrayList term5375 = new ArrayList();
        LinkedHashMap term5378 = new LinkedHashMap();
        LinkedHashMap term5379 = new LinkedHashMap();
        ArrayList term5380 = new ArrayList();
        LinkedHashMap term5382 = new LinkedHashMap();
        ArrayList term5386 = new ArrayList();
        term5366 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term5367 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term5377 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5367, term5367.getClass(), "args", term5368);
        setField(term5367, term5367.getClass(), "options", term5375);
        setField(term5366, term5366.getClass(), "cmd", term5367);
        setField(term5377, term5377.getClass(), "shortOpts", term5378);
        setField(term5377, term5377.getClass(), "longOpts", term5379);
        setField(term5377, term5377.getClass(), "requiredOpts", term5380);
        setField(term5377, term5377.getClass(), "optionGroups", term5382);
        setField(term5366, term5366.getClass(), "options", term5377);
        setBooleanField(term5366, term5366.getClass(), "stopAtNonOption", false);
        setField(term5366, term5366.getClass(), "currentToken", "MxlszYVzRf");
        setField(term5366, term5366.getClass(), "currentOption", null);
        setBooleanField(term5366, term5366.getClass(), "skipParsing", false);
        setField(term5366, term5366.getClass(), "expectedOpts", term5386);
        LinkedHashMap term5389 = new LinkedHashMap();
        LinkedHashMap term5390 = new LinkedHashMap();
        ArrayList term5391 = new ArrayList();
        LinkedHashMap term5393 = new LinkedHashMap();
        term5388 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5388, term5388.getClass(), "shortOpts", term5389);
        setField(term5388, term5388.getClass(), "longOpts", term5390);
        setField(term5388, term5388.getClass(), "requiredOpts", term5391);
        setField(term5388, term5388.getClass(), "optionGroups", term5393);
        term5395 = (Object[]) newArray("java.lang.String", 3);
        setElement(term5395, 0, "NRdvgJlhkX");
        setElement(term5395, 1, "uuaPigETmJ");
        setElement(term5395, 2, "MxlszYVzRf");
        LinkedList term5145 = new LinkedList();
        ((LinkedList) term5145).add("NRdvgJlhkX");
        ((LinkedList) term5145).add("");
        ((LinkedList) term5145).add((Object)null);
        ArrayList term5164 = new ArrayList();
        term5144 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term5144, term5144.getClass(), "args", term5145);
        setField(term5144, term5144.getClass(), "options", term5164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term113;
        args[1] = term136;
        Object retValue = callMethod(klass, "parse", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term5366));
        assertTrue(recursiveEquals(term113, term5388));
        assertTrue(recursiveEquals(term136, term5395));
        assertTrue(recursiveEquals(retValue, term5144));
    }

};


