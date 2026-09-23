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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class XmlDeclaration_outerHtmlHead_39918189111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;
     Object term279;
     Object term281;

    public XmlDeclaration_outerHtmlHead_39918189111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term250 = new ArrayList();
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        LinkedHashMap term255 = new LinkedHashMap();
        term236 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term254 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term236, term236.getClass(), "name", "tbcdzjIfER");
        setBooleanField(term236, term236.getClass(), "isProcessingInstruction", true);
        setField(term236, term236.getClass(), "parentNode", null);
        setField(term236, term236.getClass(), "childNodes", term250);
        setField(term254, term254.getClass(), "attributes", term255);
        setField(term236, term236.getClass(), "attributes", term254);
        setField(term236, term236.getClass(), "baseUri", "RkybSrpybU");
        setIntField(term236, term236.getClass(), "siblingIndex", 391863371);
        term279 = new Integer(-1922583790);
        Class<? extends Object> term1711 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term1710 = ((Class) term1711).getDeclaredField((String) "html");
        ((Field) term1710).setAccessible(true);
        Object enum2 = ((Field) term1710).get((Object) null);
        term281 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term281, term281.getClass(), "escapeMode", null);
        setField(term281, term281.getClass(), "charset", null);
        setField(term281, term281.getClass(), "charsetEncoder", null);
        setBooleanField(term281, term281.getClass(), "prettyPrint", true);
        setBooleanField(term281, term281.getClass(), "outline", true);
        setIntField(term281, term281.getClass(), "indentAmount", -616727354);
        setField(term281, term281.getClass(), "syntax", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term279;
        args[2] = term281;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term236, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


