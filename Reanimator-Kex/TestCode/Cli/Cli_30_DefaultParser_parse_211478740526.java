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
import java.lang.IllegalArgumentException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultParser_parse_211478740526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;
     Object term348;
     Object term368;
     Object term441;

    public DefaultParser_parse_211478740526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term245 = new LinkedList();
        ArrayList term248 = new ArrayList();
        HashMap term253 = new HashMap();
        HashMap term258 = new HashMap();
        ArrayList term263 = new ArrayList();
        HashMap term267 = new HashMap();
        ArrayList term338 = new ArrayList();
        ArrayList term344 = new ArrayList();
        term243 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term244 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term252 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term285 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term337 = newInstance(Class.forName("java.lang.Object"));
        setField(term244, term244.getClass(), "args", term245);
        setField(term244, term244.getClass(), "options", term248);
        setField(term243, term243.getClass(), "cmd", term244);
        setField(term252, term252.getClass(), "shortOpts", term253);
        setField(term252, term252.getClass(), "longOpts", term258);
        setField(term252, term252.getClass(), "requiredOpts", term263);
        setField(term252, term252.getClass(), "optionGroups", term267);
        setField(term243, term243.getClass(), "options", term252);
        setBooleanField(term243, term243.getClass(), "stopAtNonOption", true);
        setField(term243, term243.getClass(), "currentToken", "hRNSzYYIrc");
        setField(term285, term285.getClass(), "opt", "RMFIsYGgne");
        setField(term285, term285.getClass(), "longOpt", "NRdvgJlhkX");
        setField(term285, term285.getClass(), "argName", "uuaPigETmJ");
        setField(term285, term285.getClass(), "description", "MxlszYVzRf");
        setBooleanField(term285, term285.getClass(), "required", true);
        setBooleanField(term285, term285.getClass(), "optionalArg", true);
        setIntField(term285, term285.getClass(), "numberOfArgs", 1162663216);
        setField(term285, term285.getClass(), "type", term337);
        setField(term285, term285.getClass(), "values", term338);
        setCharField(term285, term285.getClass(), "valuesep", 'A');
        setField(term243, term243.getClass(), "currentOption", term285);
        setBooleanField(term243, term243.getClass(), "skipParsing", true);
        setField(term243, term243.getClass(), "expectedOpts", term344);
        HashMap term349 = new HashMap();
        HashMap term354 = new HashMap();
        ArrayList term359 = new ArrayList();
        HashMap term363 = new HashMap();
        term348 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term348, term348.getClass(), "shortOpts", term349);
        setField(term348, term348.getClass(), "longOpts", term354);
        setField(term348, term348.getClass(), "requiredOpts", term359);
        setField(term348, term348.getClass(), "optionGroups", term363);
        term368 = (Object[]) newArray("java.lang.String", 6);
        setElement(term368, 0, "LQFpaHEwXR");
        setElement(term368, 1, "oVcInYnLWB");
        setElement(term368, 2, "aJlieCFVtF");
        setElement(term368, 3, "ZiaGIbnzTs");
        setElement(term368, 4, "tbcdzjIfER");
        setElement(term368, 5, "HyxfbSQYBe");
        term441 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Properties");
        Object[] args = new Object[3];
        args[0] = term348;
        args[1] = term368;
        args[2] = term441;
        try {
            callMethod(klass, "parse", argTypes, term243, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


