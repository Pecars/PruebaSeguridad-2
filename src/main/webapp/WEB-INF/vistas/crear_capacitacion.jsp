<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


            <jsp:include page="plantillas/nav.jsp"></jsp:include>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Crear Capacitacion</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-10 col-md-6">
                        <form role="form">
                            <div class="form-group col-lg-6">
                                <label>Tipo Capacitacion</label>
                                <select class="form-control">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
                            </div>
                            <div class="form-group col-lg-6">
                                <label>Profesional</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Paula Carrasco" disabled>
                            </div>
                            <div class="form-group col-lg-6">
                                <label>Empresa</label>
                                <select class="form-control">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
                            </div>
                            <div class="form-group col-lg-6">
                                <label>Fecha agendada</label>
                                <input class="form-control" type="date">
                            </div>
                            <div class="form-group col-lg-6">
                                <label>Fecha Realizada</label>
                                <input class="form-control" type="date">
                            </div>
                            <!--
                            <div class="form-group col-lg-6">
                                <label>Estado capacitacion</label>
                                <input class="form-control" type="text">
							</div>
							-->
                            <div class="form-group col-lg-6">
                                <label>Tema capacitacion</label>
                                <input class="form-control" type="text">
                            </div>
                            <div class="form-group col-lg-12">
                                <label>Observaciones</label>
                                <textarea class="form-control" rows="3"></textarea>
                            </div>

                            <div class="col-lg-4">
                                <button type="submit" class="btn btn-default btn-success btn-form">Submit Button</button>
                                <button type="reset" class="btn btn-default btn-danger btn-form">Reset Button</button>
                            </div>
                        </form>
                    </div>

                </div>
                <!-- /.row -->

            </div>

            <jsp:include page="plantillas/scripts.jsp"></jsp:include>