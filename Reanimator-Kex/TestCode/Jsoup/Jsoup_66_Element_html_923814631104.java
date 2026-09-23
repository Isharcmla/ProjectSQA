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

public class Element_html_923814631104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8990;

    public Element_html_923814631104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9016 = new ArrayList();
        ((ArrayList) term9016).add((Object)null);
        ((ArrayList) term9016).add((Object)null);
        ((ArrayList) term9016).add((Object)null);
        ((ArrayList) term9016).add((Object)null);
        ((ArrayList) term9016).add((Object)null);
        term8990 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8991 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9012 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term9013 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9014 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term9020 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9022 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9023 = (Object[]) newArray("java.lang.String", 0);
        setField(term8991, term8991.getClass(), "tagName", "UBRmXJmfrt");
        setBooleanField(term8991, term8991.getClass(), "isBlock", true);
        setBooleanField(term8991, term8991.getClass(), "formatAsBlock", false);
        setBooleanField(term8991, term8991.getClass(), "canContainInline", true);
        setBooleanField(term8991, term8991.getClass(), "empty", false);
        setBooleanField(term8991, term8991.getClass(), "selfClosing", true);
        setBooleanField(term8991, term8991.getClass(), "preserveWhitespace", true);
        setBooleanField(term8991, term8991.getClass(), "formList", false);
        setBooleanField(term8991, term8991.getClass(), "formSubmit", false);
        setField(term8990, term8990.getClass(), "tag", term8991);
        setField(term9012, term9012.getClass(), "referent", null);
        setField(term9013, term9013.getClass(), "lock", term9014);
        setField(term9013, term9013.getClass(), "head", null);
        setLongField(term9013, term9013.getClass(), "queueLength", -8085190702504231560L);
        setField(term9012, term9012.getClass(), "queue", term9013);
        setField(term9012, term9012.getClass(), "next", null);
        setField(term9012, term9012.getClass(), "discovered", null);
        setField(term8990, term8990.getClass(), "shadowChildrenRef", term9012);
        setField(term8990, term8990.getClass(), "childNodes", term9016);
        setIntField(term9020, term9020.getClass(), "size", -1195339592);
        setField(term9020, term9020.getClass(), "keys", term9022);
        setField(term9020, term9020.getClass(), "vals", term9023);
        setField(term8990, term8990.getClass(), "attributes", term9020);
        setField(term8990, term8990.getClass(), "baseUri", "WZzvmIHhzZ");
        setField(term8990, term8990.getClass(), "parentNode", null);
        setIntField(term8990, term8990.getClass(), "siblingIndex", -376422566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "doQLHkjpNm";
        callMethod(klass, "html", argTypes, term8990, args);
    }

};


