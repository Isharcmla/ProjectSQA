package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class Element_outerHtmlTail_126971221884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16293;
     Object term16358;
     Object term16378;
     Object term16380;

    public Element_outerHtmlTail_126971221884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16315 = new HashMap();
        Set<Object> term16856 =  ((Map) term16315).keySet();
        HashSet term16314 = new HashSet((Collection<? extends Object>) term16856);
        ArrayList term16329 = new ArrayList();
        ((ArrayList) term16329).add((Object)null);
        ((ArrayList) term16329).add((Object)null);
        ((ArrayList) term16329).add((Object)null);
        ((ArrayList) term16329).add((Object)null);
        ((ArrayList) term16329).add((Object)null);
        ((ArrayList) term16329).add((Object)null);
        LinkedHashMap term16334 = new LinkedHashMap();
        term16293 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term16294 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term16333 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term16294, term16294.getClass(), "tagName", "oYymmLqbfJ");
        setBooleanField(term16294, term16294.getClass(), "isBlock", true);
        setBooleanField(term16294, term16294.getClass(), "formatAsBlock", false);
        setBooleanField(term16294, term16294.getClass(), "canContainBlock", true);
        setBooleanField(term16294, term16294.getClass(), "canContainInline", false);
        setBooleanField(term16294, term16294.getClass(), "empty", false);
        setBooleanField(term16294, term16294.getClass(), "selfClosing", true);
        setBooleanField(term16294, term16294.getClass(), "preserveWhitespace", false);
        setField(term16293, term16293.getClass(), "tag", term16294);
        setField(term16293, term16293.getClass(), "classNames", term16314);
        setField(term16293, term16293.getClass(), "parentNode", null);
        setField(term16293, term16293.getClass(), "childNodes", term16329);
        setField(term16333, term16333.getClass(), "attributes", term16334);
        setField(term16293, term16293.getClass(), "attributes", term16333);
        setField(term16293, term16293.getClass(), "baseUri", "tlRvilQyjJ");
        setIntField(term16293, term16293.getClass(), "siblingIndex", 197109649);
        term16358 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term16359 = (byte[]) newByteArray(16);
        setField(term16358, term16358.getClass(), "value", term16359);
        setByteField(term16358, term16358.getClass(), "coder", (byte) -58);
        setIntField(term16358, term16358.getClass(), "count", -1239406390);
        term16378 = new Integer(1557431527);
        Class<? extends Object> term16884 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term16883 = ((Class) term16884).getDeclaredField((String) "xhtml");
        ((Field) term16883).setAccessible(true);
        Object enum1 = ((Field) term16883).get((Object) null);
        term16380 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term16795 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term16803 = (Object[]) newArray("java.lang.String", 2);
        Object term16829 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term16832 = (byte[]) newByteArray(1);
        Object term16834 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        setField(term16380, term16380.getClass(), "escapeMode", enum1);
        setField(term16795, term16795.getClass(), "name", "UTF-8");
        setElement(term16803, 0, "UTF8");
        setElement(term16803, 1, "unicode-1-1-utf-8");
        setField(term16795, term16795.getClass(), "aliases", term16803);
        setField(term16795, term16795.getClass(), "aliasSet", null);
        setField(term16380, term16380.getClass(), "charset", term16795);
        setField(term16829, term16829.getClass(), "sgp", null);
        setField(term16829, term16829.getClass(), "charset", term16795);
        setFloatField(term16829, term16829.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term16829, term16829.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term16832, 0, (byte) 63);
        setField(term16829, term16829.getClass(), "replacement", term16832);
        setField(term16834, term16834.getClass(), "name", "REPORT");
        setField(term16829, term16829.getClass(), "malformedInputAction", term16834);
        setField(term16829, term16829.getClass(), "unmappableCharacterAction", term16834);
        setIntField(term16829, term16829.getClass(), "state", 0);
        setField(term16829, term16829.getClass(), "cachedDecoder", null);
        setField(term16380, term16380.getClass(), "charsetEncoder", term16829);
        setBooleanField(term16380, term16380.getClass(), "prettyPrint", true);
        setIntField(term16380, term16380.getClass(), "indentAmount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term16358;
        args[1] = term16378;
        args[2] = term16380;
        callMethod(klass, "outerHtmlTail", argTypes, term16293, args);
    }

};


