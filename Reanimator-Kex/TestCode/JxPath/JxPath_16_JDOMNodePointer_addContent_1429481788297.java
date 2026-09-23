package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class JDOMNodePointer_addContent_1429481788297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307205;
     Object term307295;

    public JDOMNodePointer_addContent_1429481788297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307205 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term307243 = newInstance(Class.forName("org.jdom.Element"));
        setField(term307205, term307205.getClass(), "node", term307243);
        Object term307411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term307527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term307643 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term307759 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term307875 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term307991 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308339 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308455 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308803 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term308869 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        Object term308935 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        Object term309051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term309167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term309205 = newInstance(Class.forName("org.jdom.Comment"));
        Object term309243 = newInstance(Class.forName("org.jdom.Element"));
        term307295 = new ArrayList();
        ((ArrayList) term307295).add(term307411);
        ((ArrayList) term307295).add(term307527);
        ((ArrayList) term307295).add(term307643);
        ((ArrayList) term307295).add(term307759);
        ((ArrayList) term307295).add(term307875);
        ((ArrayList) term307295).add(term307991);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term308107);
        ((ArrayList) term307295).add(term308223);
        ((ArrayList) term307295).add(term308339);
        ((ArrayList) term307295).add(term308455);
        ((ArrayList) term307295).add(term308107);
        ((ArrayList) term307295).add(term308571);
        ((ArrayList) term307295).add(term308687);
        ((ArrayList) term307295).add(term308107);
        ((ArrayList) term307295).add(term308107);
        ((ArrayList) term307295).add(term308803);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term308869);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term308869);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term308869);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term308935);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term309051);
        ((ArrayList) term307295).add(term309167);
        ((ArrayList) term307295).add((Object)null);
        ((ArrayList) term307295).add(term309205);
        ((ArrayList) term307295).add(term308935);
        ((ArrayList) term307295).add(term309243);
        ((ArrayList) term307295).add(term309243);
        ((ArrayList) term307295).add(term309243);
        ((ArrayList) term307295).add(term309243);
        ((ArrayList) term307295).add(term309243);
        ((ArrayList) term307295).add(term309243);
        ((ArrayList) term307295).add(term309243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term307295;
        try {
            callMethod(klass, "addContent", argTypes, term307205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


