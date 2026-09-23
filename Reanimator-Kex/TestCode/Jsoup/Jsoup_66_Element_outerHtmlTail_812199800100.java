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
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.String;

public class Element_outerHtmlTail_812199800100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8200;
     Object term8247;
     Object term8249;

    public Element_outerHtmlTail_812199800100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8226 = new ArrayList();
        ((ArrayList) term8226).add((Object)null);
        ((ArrayList) term8226).add((Object)null);
        ((ArrayList) term8226).add((Object)null);
        ((ArrayList) term8226).add((Object)null);
        ((ArrayList) term8226).add((Object)null);
        term8200 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8201 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8222 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term8223 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term8224 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term8230 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8232 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8233 = (Object[]) newArray("java.lang.String", 0);
        setField(term8201, term8201.getClass(), "tagName", "UKAReurpHG");
        setBooleanField(term8201, term8201.getClass(), "isBlock", false);
        setBooleanField(term8201, term8201.getClass(), "formatAsBlock", false);
        setBooleanField(term8201, term8201.getClass(), "canContainInline", true);
        setBooleanField(term8201, term8201.getClass(), "empty", true);
        setBooleanField(term8201, term8201.getClass(), "selfClosing", false);
        setBooleanField(term8201, term8201.getClass(), "preserveWhitespace", true);
        setBooleanField(term8201, term8201.getClass(), "formList", false);
        setBooleanField(term8201, term8201.getClass(), "formSubmit", true);
        setField(term8200, term8200.getClass(), "tag", term8201);
        setField(term8222, term8222.getClass(), "referent", null);
        setField(term8223, term8223.getClass(), "lock", term8224);
        setField(term8223, term8223.getClass(), "head", null);
        setLongField(term8223, term8223.getClass(), "queueLength", -8463029266761149071L);
        setField(term8222, term8222.getClass(), "queue", term8223);
        setField(term8222, term8222.getClass(), "next", null);
        setField(term8222, term8222.getClass(), "discovered", null);
        setField(term8200, term8200.getClass(), "shadowChildrenRef", term8222);
        setField(term8200, term8200.getClass(), "childNodes", term8226);
        setIntField(term8230, term8230.getClass(), "size", -525257914);
        setField(term8230, term8230.getClass(), "keys", term8232);
        setField(term8230, term8230.getClass(), "vals", term8233);
        setField(term8200, term8200.getClass(), "attributes", term8230);
        setField(term8200, term8200.getClass(), "baseUri", "WVRMUmrljA");
        setField(term8200, term8200.getClass(), "parentNode", null);
        setIntField(term8200, term8200.getClass(), "siblingIndex", 147209682);
        term8247 = new Integer(34470066);
        Class<? extends Object> term8294 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term8293 = ((Class) term8294).getDeclaredField((String) "fallback");
        ((Field) term8293).setAccessible(true);
        Object enum2 = ((Field) term8293).get((Object) null);
        Class<? extends Object> term8505 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term8504 = ((Class) term8505).getDeclaredField((String) "html");
        ((Field) term8504).setAccessible(true);
        Object enum3 = ((Field) term8504).get((Object) null);
        term8249 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term8249, term8249.getClass(), "escapeMode", null);
        setField(term8249, term8249.getClass(), "charset", null);
        setField(term8249, term8249.getClass(), "encoder", null);
        setField(term8249, term8249.getClass(), "coreCharset", enum2);
        setBooleanField(term8249, term8249.getClass(), "prettyPrint", true);
        setBooleanField(term8249, term8249.getClass(), "outline", false);
        setIntField(term8249, term8249.getClass(), "indentAmount", 2058711405);
        setField(term8249, term8249.getClass(), "syntax", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term8247;
        args[2] = term8249;
        callMethod(klass, "outerHtmlTail", argTypes, term8200, args);
    }

};


