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
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class XmlDeclaration_outerHtmlTail_73928363512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;
     Object term620;
     Object term622;
     Object term2010;
     Object term2019;

    public XmlDeclaration_outerHtmlTail_73928363512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term591 = new ArrayList();
        ((ArrayList) term591).add((Object)null);
        LinkedHashMap term596 = new LinkedHashMap();
        term577 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term595 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term577, term577.getClass(), "name", "xOEqzGAmDU");
        setBooleanField(term577, term577.getClass(), "isProcessingInstruction", true);
        setField(term577, term577.getClass(), "parentNode", null);
        setField(term577, term577.getClass(), "childNodes", term591);
        setField(term595, term595.getClass(), "attributes", term596);
        setField(term577, term577.getClass(), "attributes", term595);
        setField(term577, term577.getClass(), "baseUri", "flxyYxBRtu");
        setIntField(term577, term577.getClass(), "siblingIndex", -1955890973);
        term620 = new Integer(-2038273078);
        Class<? extends Object> term2044 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2043 = ((Class) term2044).getDeclaredField((String) "html");
        ((Field) term2043).setAccessible(true);
        Object enum3 = ((Field) term2043).get((Object) null);
        term622 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term622, term622.getClass(), "escapeMode", null);
        setField(term622, term622.getClass(), "charset", null);
        setField(term622, term622.getClass(), "charsetEncoder", null);
        setBooleanField(term622, term622.getClass(), "prettyPrint", false);
        setBooleanField(term622, term622.getClass(), "outline", true);
        setIntField(term622, term622.getClass(), "indentAmount", 1227103734);
        setField(term622, term622.getClass(), "syntax", enum3);
        ArrayList term2013 = new ArrayList();
        ((ArrayList) term2013).add((Object)null);
        LinkedHashMap term2016 = new LinkedHashMap();
        term2010 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term2015 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2010, term2010.getClass(), "name", "xOEqzGAmDU");
        setBooleanField(term2010, term2010.getClass(), "isProcessingInstruction", true);
        setField(term2010, term2010.getClass(), "parentNode", null);
        setField(term2010, term2010.getClass(), "childNodes", term2013);
        setField(term2015, term2015.getClass(), "attributes", term2016);
        setField(term2010, term2010.getClass(), "attributes", term2015);
        setField(term2010, term2010.getClass(), "baseUri", "flxyYxBRtu");
        setIntField(term2010, term2010.getClass(), "siblingIndex", -1955890973);
        Class<? extends Object> term2313 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2312 = ((Class) term2313).getDeclaredField((String) "html");
        ((Field) term2312).setAccessible(true);
        Object enum4 = ((Field) term2312).get((Object) null);
        term2019 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term2019, term2019.getClass(), "escapeMode", null);
        setField(term2019, term2019.getClass(), "charset", null);
        setField(term2019, term2019.getClass(), "charsetEncoder", null);
        setBooleanField(term2019, term2019.getClass(), "prettyPrint", false);
        setBooleanField(term2019, term2019.getClass(), "outline", true);
        setIntField(term2019, term2019.getClass(), "indentAmount", 1227103734);
        setField(term2019, term2019.getClass(), "syntax", enum4);
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
        args[1] = term620;
        args[2] = term622;
        callMethod(klass, "outerHtmlTail", argTypes, term577, args);
        assertTrue(recursiveEquals(term577, term2010));
        assertTrue(recursiveEquals(term620, -2038273078));
        assertTrue(recursiveEquals(term622, term2019));
    }

};


