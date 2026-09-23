package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class HttpConnection_data_370985263203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2025953;
     Object term2025778;
     Object term2037042;
     Object term2037048;
     Object term2037027;

    public HttpConnection_data_370985263203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2026089 = new ArrayList();
        term2025953 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term2026037 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setField(term2026037, term2026037.getClass(), "data", term2026089);
        setField(term2025953, term2025953.getClass(), "req", term2026037);
        term2025778 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2025778, 0, "    ");
        setElement(term2025778, 1, "");
        setElement(term2025778, 2, "                ");
        setElement(term2025778, 3, "");
        Object term2037046 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$KeyVal"));
        setField(term2037046, term2037046.getClass(), "key", null);
        setField(term2037046, term2037046.getClass(), "value", null);
        setField(term2037046, term2037046.getClass(), "stream", null);
        Object term2037047 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$KeyVal"));
        setField(term2037047, term2037047.getClass(), "key", null);
        setField(term2037047, term2037047.getClass(), "value", null);
        setField(term2037047, term2037047.getClass(), "stream", null);
        ArrayList term2037044 = new ArrayList();
        ((ArrayList) term2037044).add(term2037046);
        ((ArrayList) term2037044).add(term2037047);
        term2037042 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term2037043 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setIntField(term2037043, term2037043.getClass(), "timeoutMilliseconds", 0);
        setIntField(term2037043, term2037043.getClass(), "maxBodySizeBytes", 0);
        setBooleanField(term2037043, term2037043.getClass(), "followRedirects", false);
        setField(term2037043, term2037043.getClass(), "data", term2037044);
        setBooleanField(term2037043, term2037043.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term2037043, term2037043.getClass(), "ignoreContentType", false);
        setField(term2037043, term2037043.getClass(), "parser", null);
        setBooleanField(term2037043, term2037043.getClass(), "parserDefined", false);
        setBooleanField(term2037043, term2037043.getClass(), "validateTSLCertificates", false);
        setField(term2037043, term2037043.getClass(), "postDataCharset", null);
        setField(term2037043, term2037043.getClass(), "url", null);
        setField(term2037043, term2037043.getClass(), "method", null);
        setField(term2037043, term2037043.getClass(), "headers", null);
        setField(term2037043, term2037043.getClass(), "cookies", null);
        setField(term2037042, term2037042.getClass(), "req", term2037043);
        setField(term2037042, term2037042.getClass(), "res", null);
        term2037048 = (Object[]) newArray("java.lang.String", 4);
        setElement(term2037048, 0, "    ");
        setElement(term2037048, 1, "");
        setElement(term2037048, 2, "                ");
        setElement(term2037048, 3, "");
        Object term2037034 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$KeyVal"));
        setField(term2037034, term2037034.getClass(), "key", null);
        setField(term2037034, term2037034.getClass(), "value", null);
        setField(term2037034, term2037034.getClass(), "stream", null);
        Object term2037035 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$KeyVal"));
        setField(term2037035, term2037035.getClass(), "key", null);
        setField(term2037035, term2037035.getClass(), "value", null);
        setField(term2037035, term2037035.getClass(), "stream", null);
        ArrayList term2037032 = new ArrayList();
        ((ArrayList) term2037032).add(term2037034);
        ((ArrayList) term2037032).add(term2037035);
        term2037027 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term2037028 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        setIntField(term2037028, term2037028.getClass(), "timeoutMilliseconds", 0);
        setIntField(term2037028, term2037028.getClass(), "maxBodySizeBytes", 0);
        setBooleanField(term2037028, term2037028.getClass(), "followRedirects", false);
        setField(term2037028, term2037028.getClass(), "data", term2037032);
        setBooleanField(term2037028, term2037028.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term2037028, term2037028.getClass(), "ignoreContentType", false);
        setField(term2037028, term2037028.getClass(), "parser", null);
        setBooleanField(term2037028, term2037028.getClass(), "parserDefined", false);
        setBooleanField(term2037028, term2037028.getClass(), "validateTSLCertificates", false);
        setField(term2037028, term2037028.getClass(), "postDataCharset", null);
        setField(term2037028, term2037028.getClass(), "url", null);
        setField(term2037028, term2037028.getClass(), "method", null);
        setField(term2037028, term2037028.getClass(), "headers", null);
        setField(term2037028, term2037028.getClass(), "cookies", null);
        setField(term2037027, term2037027.getClass(), "req", term2037028);
        setField(term2037027, term2037027.getClass(), "res", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2025778;
        Object retValue = callMethod(klass, "data", argTypes, term2025953, args);
        assertTrue(recursiveEquals(term2025953, term2037042));
        assertTrue(recursiveEquals(term2025778, term2037048));
        assertTrue(recursiveEquals(retValue, term2037027));
    }

};


