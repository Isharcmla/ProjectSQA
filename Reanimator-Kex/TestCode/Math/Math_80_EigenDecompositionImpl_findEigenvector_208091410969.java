package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EigenDecompositionImpl_findEigenvector_208091410969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4973;
     Object term5096;
     Object term5098;
     Object term5106;

    public EigenDecompositionImpl_findEigenvector_208091410969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4973 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term4975 = (double[]) newDoubleArray(9);
        double[] term4985 = (double[]) newDoubleArray(8);
        double[] term4994 = (double[]) newDoubleArray(6);
        Object term5001 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term5002 = (Object[]) newArray("[D", 7);
        double[] term5003 = (double[]) newDoubleArray(2);
        double[] term5006 = (double[]) newDoubleArray(3);
        double[] term5010 = (double[]) newDoubleArray(6);
        double[] term5017 = (double[]) newDoubleArray(4);
        double[] term5022 = (double[]) newDoubleArray(5);
        double[] term5028 = (double[]) newDoubleArray(4);
        double[] term5033 = (double[]) newDoubleArray(4);
        double[] term5038 = (double[]) newDoubleArray(1);
        double[] term5040 = (double[]) newDoubleArray(6);
        double[] term5053 = (double[]) newDoubleArray(0);
        double[] term5065 = (double[]) newDoubleArray(7);
        double[] term5073 = (double[]) newDoubleArray(9);
        Object[] term5083 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 6);
        Object term5084 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5085 = (double[]) newDoubleArray(0);
        Object term5086 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5087 = (double[]) newDoubleArray(0);
        Object term5088 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5089 = (double[]) newDoubleArray(0);
        Object term5090 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5091 = (double[]) newDoubleArray(0);
        Object term5092 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5093 = (double[]) newDoubleArray(0);
        Object term5094 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term5095 = (double[]) newDoubleArray(0);
        setDoubleField(term4973, term4973.getClass(), "splitTolerance", 0.9466680868919217);
        setDoubleElement(term4975, 0, 0.36227932211585556);
        setDoubleElement(term4975, 1, 0.7884212026191082);
        setDoubleElement(term4975, 2, 0.43157400536345547);
        setDoubleElement(term4975, 3, 0.912664784591305);
        setDoubleElement(term4975, 4, 0.480386979328813);
        setDoubleElement(term4975, 5, 0.01592167492966401);
        setDoubleElement(term4975, 6, 0.42334919713484);
        setDoubleElement(term4975, 7, 0.1656681162398389);
        setDoubleElement(term4975, 8, 0.07442634263915149);
        setField(term4973, term4973.getClass(), "main", term4975);
        setDoubleElement(term4985, 0, 0.23350299908339045);
        setDoubleElement(term4985, 1, 0.509609169335183);
        setDoubleElement(term4985, 2, 0.9784213336968954);
        setDoubleElement(term4985, 3, 0.9264698709562696);
        setDoubleElement(term4985, 4, 0.9972115514484279);
        setDoubleElement(term4985, 5, 0.8570713738472238);
        setDoubleElement(term4985, 6, 0.5786558610723456);
        setDoubleElement(term4985, 7, 0.985113537921437);
        setField(term4973, term4973.getClass(), "secondary", term4985);
        setDoubleElement(term4994, 0, 0.5681787566947316);
        setDoubleElement(term4994, 1, 0.2758918739937213);
        setDoubleElement(term4994, 2, 0.09661668524288114);
        setDoubleElement(term4994, 3, 0.9581993713784439);
        setDoubleElement(term4994, 4, 0.45575656525288766);
        setDoubleElement(term4994, 5, 0.1134156171315317);
        setField(term4973, term4973.getClass(), "squaredSecondary", term4994);
        setDoubleElement(term5003, 0, 0.34721779970686717);
        setDoubleElement(term5003, 1, 0.1945214360528884);
        setElement(term5002, 0, term5003);
        setDoubleElement(term5006, 0, 0.10126767071705434);
        setDoubleElement(term5006, 1, 0.8855948944148047);
        setDoubleElement(term5006, 2, 0.49751738614716645);
        setElement(term5002, 1, term5006);
        setDoubleElement(term5010, 0, 0.9425582127686656);
        setDoubleElement(term5010, 1, 0.33753235269305204);
        setDoubleElement(term5010, 2, 0.35374782181818876);
        setDoubleElement(term5010, 3, 0.5657100534018157);
        setDoubleElement(term5010, 4, 0.6025951926683139);
        setDoubleElement(term5010, 5, 0.23296735277497205);
        setElement(term5002, 2, term5010);
        setDoubleElement(term5017, 0, 0.48577449904101155);
        setDoubleElement(term5017, 1, 0.9995918828253566);
        setDoubleElement(term5017, 2, 0.7731713646792354);
        setDoubleElement(term5017, 3, 0.8089349950006691);
        setElement(term5002, 3, term5017);
        setDoubleElement(term5022, 0, 0.6286433722348191);
        setDoubleElement(term5022, 1, 0.2904608084686109);
        setDoubleElement(term5022, 2, 0.7336037382058631);
        setDoubleElement(term5022, 3, 0.9051528472881176);
        setDoubleElement(term5022, 4, 0.26290623936503077);
        setElement(term5002, 4, term5022);
        setDoubleElement(term5028, 0, 0.6926740283264187);
        setDoubleElement(term5028, 1, 0.5014144252751771);
        setDoubleElement(term5028, 2, 0.16035791157201595);
        setDoubleElement(term5028, 3, 0.9101947304330467);
        setElement(term5002, 5, term5028);
        setDoubleElement(term5033, 0, 0.6395904389914289);
        setDoubleElement(term5033, 1, 0.7568050028114482);
        setDoubleElement(term5033, 2, 0.6740515729051598);
        setDoubleElement(term5033, 3, 0.12109735131154586);
        setElement(term5002, 6, term5033);
        setField(term5001, term5001.getClass(), "householderVectors", term5002);
        setDoubleElement(term5038, 0, 0.3733851877498551);
        setField(term5001, term5001.getClass(), "main", term5038);
        setDoubleElement(term5040, 0, 0.7358933632028694);
        setDoubleElement(term5040, 1, 0.42003470094660345);
        setDoubleElement(term5040, 2, 0.9835109766239706);
        setDoubleElement(term5040, 3, 0.6392306048929333);
        setDoubleElement(term5040, 4, 0.6602482351851126);
        setDoubleElement(term5040, 5, 0.8935747120984449);
        setField(term5001, term5001.getClass(), "secondary", term5040);
        setField(term5001, term5001.getClass(), "cachedQ", null);
        setField(term5001, term5001.getClass(), "cachedQt", null);
        setField(term5001, term5001.getClass(), "cachedT", null);
        setField(term4973, term4973.getClass(), "transformer", term5001);
        setDoubleField(term4973, term4973.getClass(), "lowerSpectra", 0.2605061149930482);
        setDoubleField(term4973, term4973.getClass(), "upperSpectra", 0.033595562894201625);
        setDoubleField(term4973, term4973.getClass(), "minPivot", 0.39232732860701935);
        setDoubleField(term4973, term4973.getClass(), "sigma", 0.7914296018947934);
        setDoubleField(term4973, term4973.getClass(), "sigmaLow", 0.09194044012181457);
        setDoubleField(term4973, term4973.getClass(), "tau", 0.7419234846002456);
        setField(term4973, term4973.getClass(), "work", term5053);
        setIntField(term4973, term4973.getClass(), "pingPong", 1442160736);
        setDoubleField(term4973, term4973.getClass(), "qMax", 0.7847448973268806);
        setDoubleField(term4973, term4973.getClass(), "eMin", 0.7475866933925822);
        setIntField(term4973, term4973.getClass(), "tType", 1114000454);
        setDoubleField(term4973, term4973.getClass(), "dMin", 0.175500624303907);
        setDoubleField(term4973, term4973.getClass(), "dMin1", 0.952706612509487);
        setDoubleField(term4973, term4973.getClass(), "dMin2", 0.6258653167615772);
        setDoubleField(term4973, term4973.getClass(), "dN", 0.27745631197945686);
        setDoubleField(term4973, term4973.getClass(), "dN1", 0.48054780123911967);
        setDoubleField(term4973, term4973.getClass(), "dN2", 0.1929824244999918);
        setDoubleField(term4973, term4973.getClass(), "g", 0.17503909932426287);
        setDoubleElement(term5065, 0, 0.11939395248958418);
        setDoubleElement(term5065, 1, 0.8420870522576868);
        setDoubleElement(term5065, 2, 0.19453534556565488);
        setDoubleElement(term5065, 3, 0.027868395377471655);
        setDoubleElement(term5065, 4, 0.10480688815873318);
        setDoubleElement(term5065, 5, 0.23237680988355713);
        setDoubleElement(term5065, 6, 0.6705953059977126);
        setField(term4973, term4973.getClass(), "realEigenvalues", term5065);
        setDoubleElement(term5073, 0, 0.45520924240346106);
        setDoubleElement(term5073, 1, 0.5367341473773021);
        setDoubleElement(term5073, 2, 0.11413948355242964);
        setDoubleElement(term5073, 3, 0.5595819839299788);
        setDoubleElement(term5073, 4, 0.4191883014045077);
        setDoubleElement(term5073, 5, 0.8116716530595368);
        setDoubleElement(term5073, 6, 0.04202974052941144);
        setDoubleElement(term5073, 7, 0.8754517708094425);
        setDoubleElement(term5073, 8, 0.18533161831961387);
        setField(term4973, term4973.getClass(), "imagEigenvalues", term5073);
        setField(term5084, term5084.getClass(), "data", term5085);
        setElement(term5083, 0, term5084);
        setField(term5086, term5086.getClass(), "data", term5087);
        setElement(term5083, 1, term5086);
        setField(term5088, term5088.getClass(), "data", term5089);
        setElement(term5083, 2, term5088);
        setField(term5090, term5090.getClass(), "data", term5091);
        setElement(term5083, 3, term5090);
        setField(term5092, term5092.getClass(), "data", term5093);
        setElement(term5083, 4, term5092);
        setField(term5094, term5094.getClass(), "data", term5095);
        setElement(term5083, 5, term5094);
        setField(term4973, term4973.getClass(), "eigenvectors", term5083);
        setField(term4973, term4973.getClass(), "cachedV", null);
        setField(term4973, term4973.getClass(), "cachedD", null);
        setField(term4973, term4973.getClass(), "cachedVt", null);
        term5096 = new Double(0.6805470062331878);
        term5098 = (double[]) newDoubleArray(7);
        setDoubleElement(term5098, 0, 0.5979621527775331);
        setDoubleElement(term5098, 1, 0.29346210714159526);
        setDoubleElement(term5098, 2, 0.8219740364339214);
        setDoubleElement(term5098, 3, 0.11213136210229069);
        setDoubleElement(term5098, 4, 0.8210953626131615);
        setDoubleElement(term5098, 5, 0.9956756723559721);
        setDoubleElement(term5098, 6, 0.9064375513517384);
        term5106 = (double[]) newDoubleArray(9);
        setDoubleElement(term5106, 0, 0.1958083631897316);
        setDoubleElement(term5106, 1, 0.5247154817441054);
        setDoubleElement(term5106, 2, 0.10228475332444498);
        setDoubleElement(term5106, 3, 0.4420374378822851);
        setDoubleElement(term5106, 4, 0.9005032778128517);
        setDoubleElement(term5106, 5, 0.2799558829245351);
        setDoubleElement(term5106, 6, 0.22284399074514416);
        setDoubleElement(term5106, 7, 0.33079540467241564);
        setDoubleElement(term5106, 8, 0.7927082403986435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term5096;
        args[1] = term5098;
        args[2] = term5106;
        try {
            callMethod(klass, "findEigenvector", argTypes, term4973, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


