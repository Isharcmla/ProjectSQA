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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttributeValue_1832587100172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4452;

    public Element_getElementsByAttributeValue_1832587100172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4478 = new ArrayList();
        ((ArrayList) term4478).add((Object)null);
        ((ArrayList) term4478).add((Object)null);
        ((ArrayList) term4478).add((Object)null);
        ((ArrayList) term4478).add((Object)null);
        ((ArrayList) term4478).add((Object)null);
        ((ArrayList) term4478).add((Object)null);
        ((ArrayList) term4478).add((Object)null);
        term4452 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4453 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4474 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4475 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4476 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4482 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4484 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4485 = (Object[]) newArray("java.lang.String", 0);
        setField(term4453, term4453.getClass(), "tagName", "EeBVbzjcCI");
        setBooleanField(term4453, term4453.getClass(), "isBlock", true);
        setBooleanField(term4453, term4453.getClass(), "formatAsBlock", false);
        setBooleanField(term4453, term4453.getClass(), "canContainInline", true);
        setBooleanField(term4453, term4453.getClass(), "empty", false);
        setBooleanField(term4453, term4453.getClass(), "selfClosing", false);
        setBooleanField(term4453, term4453.getClass(), "preserveWhitespace", true);
        setBooleanField(term4453, term4453.getClass(), "formList", true);
        setBooleanField(term4453, term4453.getClass(), "formSubmit", true);
        setField(term4452, term4452.getClass(), "tag", term4453);
        setField(term4474, term4474.getClass(), "referent", null);
        setField(term4475, term4475.getClass(), "lock", term4476);
        setField(term4475, term4475.getClass(), "head", null);
        setLongField(term4475, term4475.getClass(), "queueLength", 3892018155439224435L);
        setField(term4474, term4474.getClass(), "queue", term4475);
        setField(term4474, term4474.getClass(), "next", null);
        setField(term4474, term4474.getClass(), "discovered", null);
        setField(term4452, term4452.getClass(), "shadowChildrenRef", term4474);
        setField(term4452, term4452.getClass(), "childNodes", term4478);
        setIntField(term4482, term4482.getClass(), "size", 1861318859);
        setField(term4482, term4482.getClass(), "keys", term4484);
        setField(term4482, term4482.getClass(), "vals", term4485);
        setField(term4452, term4452.getClass(), "attributes", term4482);
        setField(term4452, term4452.getClass(), "baseUri", "UfQtPRyWRC");
        setField(term4452, term4452.getClass(), "parentNode", null);
        setIntField(term4452, term4452.getClass(), "siblingIndex", 1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "FPvxVzzSvD";
        args[1] = "WHcwFgsGFC";
        try {
            callMethod(klass, "getElementsByAttributeValue", argTypes, term4452, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


